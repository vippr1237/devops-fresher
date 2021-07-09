package com.ifisolution.bussiness_management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class})
@RestController
public class BussinessManagementApplication {

    public static void main(String[] args) {
        SpringApplication.run(BussinessManagementApplication.class, args);
    }

    @GetMapping("/")
    public String hello() {
        return "Demo Api for Devops Fresher";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Hello admin";
    }

}
