package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.*;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@MongoEntity(collection = "seller")
public class Seller extends User {
    @BsonProperty("businessName")
    private String businessName;
    @BsonProperty("products")
    private List<ObjectId> products;

}
