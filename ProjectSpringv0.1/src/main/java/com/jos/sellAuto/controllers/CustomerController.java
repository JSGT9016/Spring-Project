package com.jos.sellAuto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jos.sellAuto.entities.Customer;
import com.jos.sellAuto.repositories.CustomerRepository;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerRepository customers;
	
	@RequestMapping("/goToCustomers")
	public String showAllCustomers(ModelMap modelMap){
		List<Customer> customerList = customers.findAll();
		modelMap.addAttribute("customerList", customerList);
		return "allCustomers";
	}
	
	@RequestMapping("/tester")
	public String test(){
		return "test";
	}
	
  /*@RequestMapping("")
	public String createCustomer(@RequestParam("id") Long id){
		Customer customer = new Customer();
		customer.setCustomerNumber(id);
		customers.save(customer);
		if(customer==null) {
			return "customerNotCreated";
		}
		return "customerCreatedSuccessful";
	}*/

}
