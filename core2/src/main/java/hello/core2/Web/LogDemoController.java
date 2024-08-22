package hello.core2.Web;

import hello.core2.common.MyLogger;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class LogDemoController {
    //provider 사용시, 컨트롤러와 서비스 계층 모두 같은 MyLogger 인스턴스를 사용

    private final LogDemoService logDemoService;
    private final MyLogger myLogger;
    //private final ObjectProvider<MyLogger> myLoggerProvider;

    // 클라이언트가 log-demo 경로로 HTTP 요청을 보내면 스프링은 logDemo 메서드에 매핑시킴
    @RequestMapping("log-demo")
    @ResponseBody // 뷰 화면 없이 바로 문자 그대로 보냄
    public String logDemo(HttpServletRequest request) {
        //HttpServletRequest request 를 통해 요청 URL 을 가져옴
        String requestURL = request.getRequestURL().toString();
        // myLoggerProvider.getObject()를 호출하여 MyLogger 빈을 생성
        // 이 시점에 MyLogger는 @Scope(value = "request")에 의해 요청 범위에서 새로운 인스턴스로 생성
        //MyLogger myLogger = myLoggerProvider.getObject();

        // MyLogger의 setRequestURL(requestURL) 메서드를 호출하여 요청 URL을 설정
        myLogger.setRequestURL(requestURL);

        myLogger.log("controller test");

        // 서비스 계층으로 이
        logDemoService.logic("testId");

        // OK 문자열 반환. HTTP 응답으로 클라이언트에게 전송
        return "Ok";

        // MyLogger의 PreDestroy 메서드 호출되고 MyLogger 빈은 소멸
    }
}
