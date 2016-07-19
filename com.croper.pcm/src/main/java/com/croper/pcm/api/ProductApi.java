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
		Product pr =new Product();
		pr.setId("prabc7778");
		pr.setName("capacitor");
		pr.setDescription("sjdjkdhfg fdiyuher oe p8tew kjdfyd op8e opdifu spdofu dodgu uiiufid odif[s0 uruod n dof du");
		productRepositoryr.save(pr);
		
		System.out.println("MMMMMMMMMMMMMMMMMMMMMMMMMMM");
       return productRepositoryr.findByName("capacitor");
		
		
    }
	

	
	
	


}