package hello.core2.scope;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import jakarta.inject.Provider;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

public class PrototypeProviderTest {

    @Test
    void providerTest() {
        // AnnotationConfigApplicationContext를 생성할 때, 스프링 컨테이너는 ClientBean과 PrototypeBean 두 클래스를 스캔하고 관리
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(ClientBean.class, PrototypeBean.class);

        ClientBean clientBean1 = ac.getBean(ClientBean.class);
        int count1 = clientBean1.logic();
        Assertions.assertThat(count1).isEqualTo(1);

        ClientBean clientBean2 = ac.getBean(ClientBean.class);
        int count2 = clientBean2.logic();
        Assertions.assertThat(count2).isEqualTo(1);
    }

    static class ClientBean {

        //ClientBean 이 스프링 컨테이너에 의해 생성될 때,
        // @Autowired 애너테이션이 붙어 있는 ac 필드에 ApplicationContext 인스턴스가 자동으로 주입
        // 주입되는 인스턴스는 ProviderTest 에서 생성된 AnnotationConfigApplicationContext 와 동일한 인스턴스
        // ClientBean 에서 주입받는 이유는 프로토타입빈을 필요시 동적으로 생성하기 위해서!
//        @Autowired
//        private ApplicationContext ac;

        @Autowired
        //private ObjectProvider<PrototypeBean> prototypeBeanProvider;
        private Provider<PrototypeBean> prototypeBeanProvider;

        public int logic() {
            //ApplicationContext 를 통해 스프링 컨테이너에서 관리하는 빈(PrototypeBean)을 요청
//            PrototypeBean prototypeBean = ac.getBean(PrototypeBean.class);
            //PrototypeBean prototypeBean = prototypeBeanProvider.getObject();
            PrototypeBean prototypeBean = prototypeBeanProvider.get();
            prototypeBean.addCount();
            int count = prototypeBean.getCount();
            return count;
        }
    }

    @Scope("prototype")
    static class PrototypeBean {
        private int count = 0;

        public void addCount() {
            count++;
        }

        public int getCount() {
            return count;
        }

        @PostConstruct
        public void init() {
            System.out.println("PrototypeBean.init " + this);
        }

        @PreDestroy
        public void destroy() {
            System.out.println("PrototypeBean.destroy");
        }
    }
}
