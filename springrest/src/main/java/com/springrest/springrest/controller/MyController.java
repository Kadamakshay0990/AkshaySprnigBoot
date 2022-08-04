package com.springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Employee;
import com.springrest.springrest.service.EmployeeService;

@RestController
public class MyController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/welcome")
	public String  home() {
		return "Hello";
	}

	//return all data
	@GetMapping("/Employees")
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	//return single data
	@GetMapping("/Employees/{id}")
	public Employee getEmployees(@PathVariable String id)
	{
		return this.employeeService.getEmployees(Long.parseLong(id));
	}
	
	//add data
	@PostMapping("/Employees")
	public Employee addEmployees(@RequestBody Employee employee)
	{
		return this.employeeService.addEmployees(employee);
	}
	
	@PutMapping("/Employees")
	public Employee updateEmployees(@RequestBody Employee employee)
	{
		return this.employeeService.updateEmployees(employee);
	}
	
	
}