package com.pack;

public class Accountant extends Employee {
	private boolean salaryProcessDay;
	private boolean approvalTaken;

	public boolean isSalaryProcessDay() {
		return salaryProcessDay;
	}

	public void setSalaryProcessDay(boolean salaryProcessDay) {
		this.salaryProcessDay = salaryProcessDay;
	}

	public boolean isApprovalTaken() {
		return approvalTaken;
	}

	public void setApprovalTaken(boolean approvalTaken) {
		this.approvalTaken = approvalTaken;
	}

	@Override
	public String toString() {
		return "Accountant [salaryProcessDay=" + salaryProcessDay + ", approvalTaken=" + approvalTaken
				+ ", isSalaryProcessDay()=" + isSalaryProcessDay() + ", isApprovalTaken()=" + isApprovalTaken()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

	public Accountant(int id, String name, String city, boolean salaryProcessDay, boolean approvalTaken) {
		super(id, name, city);
		this.salaryProcessDay = salaryProcessDay;
		this.approvalTaken = approvalTaken;
	}

	public static void main(String args[]) {
		Accountant a = new Accountant(102, "Abhay", "Gurgaon", true, false);
		System.out.println(a);
	}
}
