package com.atomist.samples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableDiscoveryClient
public class SimpleBootMicroserviceApplication {

    @RequestMapping("/")
    public String home() {
        return this.toString() + " instance saying: Hello Microservice World";
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleBootMicroserviceApplication.class, args);
    }
}
