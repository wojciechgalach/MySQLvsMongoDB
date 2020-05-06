package pl.com.nur.mysqlvsmongo.component;


import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;

@Aspect
@Component
public class TimeAspect {

    private Instant end;
    private Instant start;

    @Before("@annotation(TimeAspectIntrface)")
    private void startTimer() {
        start = Instant.now();
//        stopWatch.start();
    }

    @After("@annotation(TimeAspectIntrface)")
    private void stopTiemr() {
        end = Instant.now();
        long millis = Duration.between(start, end).toMillis();
        System.out.println( millis + " ms");
    }

}
