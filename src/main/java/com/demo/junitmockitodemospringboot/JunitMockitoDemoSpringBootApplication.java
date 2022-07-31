package com.demo.junitmockitodemospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JunitMockitoDemoSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunitMockitoDemoSpringBootApplication.class, args);
    }

}
