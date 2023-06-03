package com.nikhilaukhaj.mongo.repository;

import com.nikhilaukhaj.mongo.model.User;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import jakarta.enterprise.context.ApplicationScoped;


public interface UserRepository<T extends User> extends PanacheMongoRepository<T> {
    public default T findByUsername(String username){
        return find("username", username).firstResult();
    }

}
