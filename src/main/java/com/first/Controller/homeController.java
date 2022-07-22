package com.first.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.first.entity.Employee;
import com.first.service.EmpServiceImpl;

@Controller
@RequestMapping("/Employee")
public class homeController {
	
	@Autowired
	private EmpServiceImpl service;
	
	@RequestMapping("/home")
	public String home() {
		return "index";
	}
	
	@RequestMapping("/reg")
	public String register() {
		return "reg";
	}
	
	@RequestMapping("/save")
	public String saveEmployee(@ModelAttribute Employee emp ,Model model) {
		System.out.println("save called ::"+emp);
		
		Integer id = service.saveEmp(emp);
		System.out.println("emp saved with id"+id);
		
		model.addAttribute("id","emp save with id"+id);
		return "reg";
		
	}
	@RequestMapping("/all")
	public String allEmployee(@ModelAttribute Employee emp ,Model model) {
		System.out.println("save called ::"+emp);
		
		List<Employee> empList = service.getAllEmp();
		System.out.println("All emp:: "+empList);
		System.out.println("Test: "+empList);
		
		model.addAttribute("empList",empList);
		return "idTemplate";
		
	}
	

}
