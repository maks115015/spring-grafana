package com.example.hw2.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "mongo")
public interface MongoDataRepository extends MongoRepository<Data, String> {
}
