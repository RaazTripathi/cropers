package com.croper.pcm.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.croper.pcm.product.modal.Product;
import com.croper.pcm.product.repository.ProductRepository;

@RestController
@RequestMapping("/productApi")

public class ProductApi {
	@Autowired 
 ProductRepository productRepositoryr;
	
	@RequestMapping("/product")

    public Product getProduct() {

       return productRepositoryr.findByName("capacitor");
		
		
    }
	

	
	
	


}
