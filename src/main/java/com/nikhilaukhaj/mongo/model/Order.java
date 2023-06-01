package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

@MongoEntity(collection = "order")
public class Order {
    public ObjectId _id;
    @BsonProperty("userId")
    public String userId;
    @BsonProperty("products")
    public Product[] products;
    @BsonProperty("totalPrice")
    public Double totalPrice;
    @BsonProperty("status")
    public Boolean status;
    @BsonProperty("createdAt")
    public String createdAt;
}
