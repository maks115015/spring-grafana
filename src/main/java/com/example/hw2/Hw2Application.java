package com.example.hw2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@EnableMongoRepositories
@EnableElasticsearchRepositories
@SpringBootApplication
public class Hw2Application {

    public static void main(String[] args) {
        SpringApplication.run(Hw2Application.class, args);
    }
}