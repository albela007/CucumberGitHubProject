package com.fanniemae.payroll.model;

public class EmployeeType {
	private String type;
	private float salary;
	private float hoursWorked;
	
	public EmployeeType(String type, float salary, float hoursWorked) {
	//	super();
		this.type = type;
		this.salary = salary;
		this.hoursWorked = hoursWorked;
	}

	public String getType() {
		return type;
	}

	public float getSalary() {
		return salary;
	}

	public float getHoursWorked() {
		return hoursWorked;
	}

	@Override
	public String toString() {
		return "EmployeeType [type=" + type + ", salary=" + salary + ", hoursWorked=" + hoursWorked + "]";
	}
	
	 
	
	
}