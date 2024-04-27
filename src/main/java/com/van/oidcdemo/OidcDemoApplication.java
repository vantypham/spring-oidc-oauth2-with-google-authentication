package com.van.oidcdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestOperations;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@SpringBootApplication
public class OidcDemoApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(OidcDemoApplication.class, args);
    }

    private RestOperations restTemplate = new RestTemplate();

    @Override
    public void run(String... args) throws Exception {
        restTemplate.getForObject("http://localhost:8081/user/profile", Map.class);
    }
}
