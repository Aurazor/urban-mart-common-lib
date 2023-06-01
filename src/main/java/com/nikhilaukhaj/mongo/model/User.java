package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

@MongoEntity(collection = "user")
public class User extends PanacheMongoEntity {
    public ObjectId _id;

    @BsonProperty("name")
    public String name;
    @BsonProperty("firstName")
    public String firstName;
    @BsonProperty("lastName")
    public String lastName;
    @BsonProperty("email")
    public String email;
    @BsonProperty("password")
    public String password;
    @BsonProperty("address")
    public String address;
    @BsonProperty("phone")
    public String phone;
    @BsonProperty("createdAt")
    public String createdAt;
}
