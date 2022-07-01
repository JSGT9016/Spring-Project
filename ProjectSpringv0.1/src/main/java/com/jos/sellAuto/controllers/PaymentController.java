package com.jos.sellAuto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jos.sellAuto.entities.Payment;
import com.jos.sellAuto.repositories.PaymentRepository;

@Controller
public class PaymentController {

	@Autowired 
	PaymentRepository paymentRepository;
	
	@RequestMapping("goToPaymentsList")
	public String getAllPayments(ModelMap modelMap) {
		List<Payment> payments = paymentRepository.findAll();
		modelMap.addAttribute("payments", payments);
		return "allPayments";
	}
	
}
