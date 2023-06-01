package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

@MongoEntity(collection = "category")
public class Category {
    public ObjectId _id;
    @BsonProperty("name")
    public String name;
    @BsonProperty("description")
    public String description;

}
