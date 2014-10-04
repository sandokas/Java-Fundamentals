package com.sandokas.exercises.inheritance;

public class Manager extends Employee{
	private String deptName;
	
	public Manager (int empId, String name, String ssn, double salary, String dept) {
		super(empId,name,ssn,salary);
		dept = this.deptName;
	}
	
	public Manager () {
		super(0,"","",0.0D);
		deptName = "";
	}
	public String getDeptName() {return null;}
	public void lixo(Employee e){}
}
