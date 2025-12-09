package com.gnanu.quizapp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Employee {
	 	@Id
	   private Long id;
	private String name;
	private Integer age;
	private String gender;
	private String mobile;
	private Integer Salary;
	private String project;
	
//	public Employee()
//	{
//	}
//	public Employee(String name , Integer age, String gender, String mobile , Integer Salary , String project)
//	{
//		this.setName(name);
//		this.setAge(age);
//		this.setGender(gender);
//		this.setMobile(mobile);
//		this.setSalary(Salary);
//		this.setProject(project);
//	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public Integer getSalary() {
		return Salary;
	}
	public void setSalary(Integer salary) {
		Salary = salary;
	}
	public String getProject() {
		return project;
	}
	public void setProject(String project) {
		this.project = project;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	

}
