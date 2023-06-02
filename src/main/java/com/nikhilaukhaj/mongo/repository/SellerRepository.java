package com.nikhilaukhaj.mongo.repository;

import com.nikhilaukhaj.mongo.model.Seller;
import org.bson.types.ObjectId;

import java.util.List;

public class SellerRepository extends UserRepository<Seller>{
    public Seller findByBusinessNames(String businessName){
        return find("businessName", businessName).firstResult();
    }

    public List<ObjectId> getListOfProductsForSeller(ObjectId sellerId){
        Seller seller = findById(sellerId);
        return seller.getProducts();
    }


}
