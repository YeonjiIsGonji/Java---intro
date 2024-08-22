package hello.core2.Web;

import hello.core2.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.ObjectProvider;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

    // myLoggerProvider.getObject()를 호출하여 동일한 요청 범위 내에서 동일한 MyLogger 인스턴스(controller 에서 호출했던 인스턴스)를 다시 가져옵니다
    //private final ObjectProvider<MyLogger> myLoggerProvider;

    private final MyLogger myLogger;

    public void logic(String id) {
        //MyLogger myLogger = myLoggerProvider.getObject();
        myLogger.log("service id = " + id);
    }
}
