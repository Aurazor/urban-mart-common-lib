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
@RequiredArgsConstructor
@MongoEntity(collection = "order")
public class Order {
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
