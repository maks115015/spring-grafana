package com.example.hw2.mongo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("data")
public record Data(@Id String id, String data) {
}
