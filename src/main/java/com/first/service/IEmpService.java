package com.first.service;

import java.util.List;
import java.util.Optional;

import com.first.entity.Employee;


public interface IEmpService {
	
	public Integer saveEmp(Employee emp);
	
	public List<Employee >getAllEmp();
	
	

	

}
