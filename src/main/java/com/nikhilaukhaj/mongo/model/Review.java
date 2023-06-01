package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

@MongoEntity(collection = "review")
public class Review {
    public ObjectId _id;
    public String userId;
    public String productId;
    public int rating;
    public String comment;
}
