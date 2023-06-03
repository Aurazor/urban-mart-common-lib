package com.nikhilaukhaj.mongo.repository;

import com.nikhilaukhaj.mongo.model.Seller;
import io.quarkus.mongodb.panache.PanacheMongoRepository;
import org.bson.types.ObjectId;

import java.util.List;


public interface SellerRepositoryInterface extends PanacheMongoRepository<Seller> {
    public default Seller findByBusinessNames(String businessName){
        return find("businessName", businessName).firstResult();
    }

    public default List<ObjectId> getListOfProductsForSeller(ObjectId sellerId){
        Seller seller = findById(sellerId);
        return seller.getProducts();
    }


}
