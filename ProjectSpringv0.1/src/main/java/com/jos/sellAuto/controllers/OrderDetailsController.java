package com.jos.sellAuto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jos.sellAuto.entities.OrderDetails;
import com.jos.sellAuto.repositories.OrderDetailsRepository;

@Controller
public class OrderDetailsController {

	@Autowired
	OrderDetailsRepository orderDetailsRespository;
	
	@RequestMapping("goToOrderDetailsList")
	public String getAllOrderDetails(ModelMap modelMap) {
		List<OrderDetails> orderDetails = orderDetailsRespository.findAll();
		modelMap.addAttribute("orderDetails", orderDetails);
		return "allOrderDetails";
	}
	
}
