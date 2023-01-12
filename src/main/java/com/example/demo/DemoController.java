package com.example.demo;
import java.lang.Exception;
import io.sentry.Sentry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @RequestMapping("/hello")
    public static void hello() {

    try {

    throw new Exception("This is a test.");

    } catch (Exception e) {
        
    Sentry.captureException(e);
    
    }
    }
}
