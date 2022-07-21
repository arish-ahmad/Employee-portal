package com.first.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;

import com.first.entity.Employee;
import com.first.repo.EmpRepo;

@Service
public class EmpServiceImpl implements IEmpService{
	
	@Autowired
	private EmpRepo repo;

	@Override
	public Integer saveEmp(Employee emp) {
		emp = repo.save(emp);
		System.out.println("service called ::"+emp.getId());
		return emp.getId();
	}

	@Override
	public List<Employee> getAllEmp() {
		List<Employee> empList = repo.findAll();
		System.out.println(empList);
		return empList;
	}

	

	
}
