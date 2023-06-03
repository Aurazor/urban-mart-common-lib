package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;
@Getter
@Setter
@NoArgsConstructor
public class User  extends PanacheMongoEntity{

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
