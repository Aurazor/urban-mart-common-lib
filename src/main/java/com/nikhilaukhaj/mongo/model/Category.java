package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bson.codecs.pojo.annotations.BsonProperty;
@Getter
@Setter
@NoArgsConstructor
@MongoEntity(collection = "category")
public class Category {
    @BsonProperty("name")
    public String name;
    @BsonProperty("description")
    public String description;

}
