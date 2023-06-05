package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.PanacheMongoEntity;
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
@MongoEntity(collection = "product")
public class Product extends PanacheMongoEntity {

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
