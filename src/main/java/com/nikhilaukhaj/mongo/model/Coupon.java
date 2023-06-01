package com.nikhilaukhaj.mongo.model;

import io.quarkus.mongodb.panache.common.MongoEntity;
import org.bson.types.ObjectId;

@MongoEntity(collection = "Coupon")
public class Coupon {
    public ObjectId _id;
    public String code;
    public double discount;
    public String validFrom;
    public String validTo;
    public String description;
}
