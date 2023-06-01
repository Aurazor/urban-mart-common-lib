package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

@MongoEntity(collection = "Product")
public class Product {
    public ObjectId _id;
    @BsonProperty("name")
    public String name;
    @BsonProperty("description")
    public String description;
    @BsonProperty("price")
    public String price;
    @BsonProperty("quantity")
    public String quantity;
    @BsonProperty("createdAt")
    public String createdAt;
}
