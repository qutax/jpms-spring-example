package red.jackal.training.spring.jpms.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"red.jackal.training.spring.jpms.config", "red.jackal.training.spring.jpms.service.impl", "red.jackal.training.spring.jpms.web.controller"})
public class WebApplication {
    public static void main(String[] args) {
        SpringApplication.run(WebApplication.class, args);
    }
}

