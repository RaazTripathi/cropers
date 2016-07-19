package com.croper.pcm.product.repository;
import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.croper.pcm.product.modal.Product;

public interface ProductRepository extends MongoRepository <Product,String>{

    public Product findByName(String name);
    public List<Product> findByDescription(String Description);
}
