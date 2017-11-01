package com.demo.SpringBootDocker;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class App {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker .. God is Great !!! Dharmendra";
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}


