package com.springrest.springrest.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.springrest.dao.EmployeeDao;
import com.springrest.springrest.entities.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDao employeeDao;
	
	//List<Employee> list;

	public EmployeeServiceImpl() {
		//list=new ArrayList<>();
	    //list.add(new Employee(1, "Java Dev", "Working As JAva"));
		//list.add(new Employee(2, "Database Dev", "Working As database dev"));
		
		
	}

	@Override
	public List<Employee> getAllEmployees() {
		

		return employeeDao.findAll();
	}

	@Override
	public Employee getEmployees(long id) {
		
		/*
		 * Employee Emp = null;
		 * 
		 * for(Employee employee:list) { if(employee.getId()==id) { Emp=employee; break;
		 * } }
		 */
		
		
		return employeeDao.getOne(id);
	}

	@Override
	public Employee addEmployees(Employee employee) {
	//	list.add(employee);
		
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Employee updateEmployees(Employee employee) {
		/*
		 * list.forEach(e ->
		 * 
		 * {
		 * 
		 * if(e.getId() == employee.getId()) { e.setTitle(employee.getTitle());
		 * e.setDesc(employee.getDesc()); } });
		 */
		
		employeeDao.save(employee);
		
		return employee;
	}

}