package com.retrievestoreorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@ComponentScan({"com.retrievestoreorder"})
public class RetrieveStoreOrderSpringBootApplication {
    public static void main(String[] args) {
        SpringApplication.run(
                new Object[] { RetrieveStoreOrderSpringBootApplication.class }, args);
    }
}
