package com.jos.sellAuto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jos.sellAuto.entities.ProductLines;
import com.jos.sellAuto.repositories.ProductLinesRepository;

@Controller
public class ProductLinesController {

	@Autowired
	private ProductLinesRepository productLinesRepository;
	
	
	@RequestMapping("/goToProductLines")
	public String listProductLines(ModelMap modelMap){
		List<ProductLines> productLinesList = productLinesRepository.findAll();
		modelMap.addAttribute("productLinesList", productLinesList);
		return "allProductLines";
	}
	
}
