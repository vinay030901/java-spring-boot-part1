package com.pack;

public class Manager extends Employee{
	int noOfEmployees;
	double hra;
	public Manager(int empId, String empName,String empCity,int noOfEmployees, double d) {
		super(empId,empName,empCity);
		this.noOfEmployees = noOfEmployees;
		this.hra = d;
	}
	public int getNoOfEmployees() {
		return noOfEmployees;
	}
	public void setNoOfEmployees(int noOfEmployees) {
		this.noOfEmployees = noOfEmployees;
	}
	public double getHra() {
		return hra;
	}
	public void setHra(double hra) {
		this.hra = hra;
	}
	@Override
	public String toString() {
		return "Manager [noOfEmployees=" + noOfEmployees + ", hra=" + hra + ", getNoOfEmployees()=" + getNoOfEmployees()
				+ ", getHra()=" + getHra() + ", getEmpId()=" + getEmpId() + ", getEmpName()=" + getEmpName()
				+ ", getEmpCity()=" + getEmpCity() + ", toString()=" + super.toString() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + "]";
	}
	public static void main(String []args) {
		Manager m=new Manager(101,"Vinay","Dehradun",12,10.4);
		System.out.println(m);
	}
	
}