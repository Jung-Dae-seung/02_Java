package com.hw1.model.vo;

public class Employee extends Person{

	private int salary;		// 급여
	private String dept;	// 부서
	
	public Employee() {}

	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String information() {
		
		/*
		String str = "";
		
		str += super.information();
		str += "급여 : " + this.salary + " / ";
		str += "부서 : " + this.dept;
		
		return str;
		*/
		
		return super.information() + String.format(" / 급여 : %d / 부서 : %s", salary, dept);
		
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}
	
	
}
