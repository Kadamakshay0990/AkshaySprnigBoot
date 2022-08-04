package com.springrest.springrest.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name = "employee")
public class Employee {
	
	
	@Autowired
	@Id
	private long id;
	private String title;
	private String description;
	
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(long id, String title, String description) {
		super();
		this.id = id;
		this.title = title;
		this.description = description;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}

	/*
	 * public String getDesc() { return description; } public void setDesc(String
	 * description) { this.description = description; }
	 */
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", title=" + title + ", description=" + description + "]";
	}
	
   


	

}