package com.croper.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.croper.product.CrProduct;

/**
 * @author raaz
 *
 */

public interface CrProductRepository extends MongoRepository<CrProduct, String> {

    public CrProduct findByProductName(String productName);
    public List<CrProduct> findByCategory(String catName);

}