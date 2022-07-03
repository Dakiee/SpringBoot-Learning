package com.example.demo.hello;

import lombok.Data;

@Data
public class Employee {
	private String employeeId;
	private String employeeName;
	private int employeeAge;
	
	public String getEmployeeId() {
		return this.employeeId;
	}
	
	public String getEmployeeName() {
		return this.employeeName;
	}
	
	public int getEmployeeAge() {
		return this.employeeAge;
	}
	
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
}
