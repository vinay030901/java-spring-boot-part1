package com.arraylistdemo;

import java.util.Comparator;

public class IDComparator implements Comparator<Employee> {

	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
//		System.out.println(o1.getEmpId());
//		if (o1.getEmpId() - o2.getEmpId() == 0)
//			return o2.getEmpCity().compareTo(o1.getEmpName());
		return o1.getEmpId() - o2.getEmpId();
	}

}
