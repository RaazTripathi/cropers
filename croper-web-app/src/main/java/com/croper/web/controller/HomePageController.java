/**
 * 
 */
package com.croper.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.croper.product.CrProduct;
import com.croper.repo.CrProductRepository;

/**
 * @author raaz
 *
 */

@Controller
public class HomePageController {
	
	@Autowired
	CrProductRepository productRepo;
	
	
	@RequestMapping("/")
	
	public  @ResponseBody String home()
	{
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		CrProduct product=new CrProduct();
		product.setId(1);
		product.setProductName("Gehu");
		
		product.setCategory(null);
		
		productRepo.save(product);
		
		System.out.println(product.toString());
		return "product";
		
	}

}