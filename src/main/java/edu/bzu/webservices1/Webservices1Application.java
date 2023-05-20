package edu.bzu.webservices1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

@RestController
@SpringBootApplication
public class Webservices1Application {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    public static void main(String[] args) {
        SpringApplication.run(Webservices1Application.class, args);


    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        Greeting greet = new Greeting(counter.incrementAndGet(), String.format(template, name));
        return greet.getContent();
    }
}
