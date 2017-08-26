package com.java.linkedList;

public class Employee {
	
	private String name;
	private String employeeId;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", employeeId=" + employeeId + "]";
	}
	
	

}
