package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

@Getter
@Setter
@NoArgsConstructor
@MongoEntity(collection = "cart")
public class Cart {
    @BsonProperty("userId")
    public ObjectId userId;
    @BsonProperty("products")
    public Product[] products;
    @BsonProperty("createdAt")
    public String createdAt;
}
