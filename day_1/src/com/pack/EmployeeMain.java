package com.pack;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// emp is reference of the object and (new employee()) is the new object
		// emp is stored in stack while the object is stored in heap
		// emp references to the object in the heap
		Employee emp1 = new Employee();
		emp1.setEmpId(101);
		emp1.setEmpName("Vinay");
		emp1.setEmpCity("Dehradun");
		System.out.println(emp1.getEmpId() + " " + emp1.getEmpName() + " " + emp1.getEmpCity());

		Employee emp2 = new Employee(123, "admin", "delhi");
//		emp1=null; -> this means that reference is not there, so connection is broken now.
		
		System.out.println(emp2);
		System.out.println(emp1.hashCode());
		emp2 = emp1;
		System.out.println(emp2.hashCode());

	}

}
