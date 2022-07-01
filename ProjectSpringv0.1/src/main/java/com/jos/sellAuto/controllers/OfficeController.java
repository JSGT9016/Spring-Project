package com.jos.sellAuto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jos.sellAuto.entities.Office;
import com.jos.sellAuto.repositories.OfficeRepository;

@Controller
public class OfficeController {
	
	@Autowired
	private OfficeRepository officeRepository;

	@RequestMapping("/goToOfficesList")
	public String getAllOffices(ModelMap modelMap) {
		List<Office> offices = officeRepository.findAll();
		modelMap.addAttribute("offices", offices);
		return "allOffices";
	}
	
}
