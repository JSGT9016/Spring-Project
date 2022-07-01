package com.jos.sellAuto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jos.sellAuto.entities.Orders;
import com.jos.sellAuto.repositories.OrderRepository;

@Controller
public class OrderController {

	@Autowired
	private OrderRepository orderReposiroty;
	
	@RequestMapping("goToOrdersList")
	public String getAllOrders(ModelMap modelMap) {
		List<Orders> orders = orderReposiroty.findAll();
		modelMap.addAttribute("orders", orders);
		return "allOrders";
	}
	
}
