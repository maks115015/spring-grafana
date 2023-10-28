package com.example.hw2.elastic;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "elastic")
public interface ElasticDataRepository extends ElasticsearchRepository<Data, String> {
}