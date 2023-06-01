package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

@MongoEntity(collection = "wishlist")
public class WishList {
    public ObjectId _id;
    public String userId;
    public Product[] products;
}
