package com.nikhilaukhaj.mongo.repository;

import com.nikhilaukhaj.mongo.model.User;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;

public class UserRepository<T extends User> implements PanacheMongoRepository<T> {
    public User findByUsername(String username){
        return find("username", username).firstResult();
    }

}
