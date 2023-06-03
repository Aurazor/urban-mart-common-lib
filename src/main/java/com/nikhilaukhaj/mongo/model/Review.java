package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
@NoArgsConstructor
@MongoEntity(collection = "review")
public class Review {
    public String userId;
    public String productId;
    public int rating;
    public String comment;
}
