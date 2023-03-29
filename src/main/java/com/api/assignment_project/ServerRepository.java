package com.api.assignment_project;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

public interface ServerRepository extends MongoRepository<Server, String>  {

    @Query("{id: '?0'}")
    Server getSeverById(String id);

    @Query("{}")
    List<Server> getAllServers();

    public long count();
}
