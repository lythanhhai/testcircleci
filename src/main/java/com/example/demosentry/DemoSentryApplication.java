package com.example.demosentry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.lang.Exception;
import io.sentry.Sentry;
@SpringBootApplication
public class DemoSentryApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoSentryApplication.class, args);

//        try {
//            throw new Exception("This is a test.");
//        } catch (Exception e) {
//            Sentry.captureException(e);
//        }
    }

}
