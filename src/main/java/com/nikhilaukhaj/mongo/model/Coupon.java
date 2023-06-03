package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.bson.types.ObjectId;

@Getter
@Setter
@NoArgsConstructor
@MongoEntity(collection = "Coupon")
public class Coupon {
    public String code;
    public double discount;
    public String validFrom;
    public String validTo;
    public String description;
}
