package com.example.hw2.elastic;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "data")
public record Data(@Id String id, String data) {
}
