package com.jos.sellAuto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jos.sellAuto.entities.Product;
import com.jos.sellAuto.repositories.ProductRepository;

@Controller
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping("goToProductList")
	public String getAllProducts(ModelMap modelMap) {
		List<Product> products = productRepository.findAll();
		modelMap.addAttribute("products",products);
		return "allProducts";
	}
	
}
