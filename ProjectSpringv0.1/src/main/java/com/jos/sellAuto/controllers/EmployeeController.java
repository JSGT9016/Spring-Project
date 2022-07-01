package com.jos.sellAuto.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jos.sellAuto.entities.Employee;
import com.jos.sellAuto.repositories.EmployeeRepository;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@RequestMapping("goToEmployeesList")
	public String getAllEmployees(ModelMap modelMap){
		List<Employee> employees = employeeRepository.findAll();
		modelMap.addAttribute("employees", employees);
		return "allEmployees";
	}
	
	@RequestMapping("showEmployeeInfo")
	public String showEmployeeInfo(@RequestParam("salesRepEmployeeNumber") Long employeeId, ModelMap modelMap) {
		Employee employee = employeeRepository.findById(employeeId).get();
		modelMap.addAttribute("employee",employee);
		return "employeeInfo";
	}
}
