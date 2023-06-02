package com.nikhilaukhaj.mongo.repository;

import com.nikhilaukhaj.mongo.model.Customer;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class CustomerRepository extends UserRepository<Customer>{

}
