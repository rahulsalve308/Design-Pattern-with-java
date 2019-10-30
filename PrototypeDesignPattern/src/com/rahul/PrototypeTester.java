package com.rahul;

import java.util.List;

public class PrototypeTester {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emps = new Employees();
		emps.loadData();
		
		//Use the clone method to get the Employee object
		Employees emp = (Employees) emps.clone();
		Employees emp1 = (Employees) emps.clone();
		Employees emp2 = (Employees) emps.clone();
		List<String> list1 = emp1.getEmpList();
		List<String> list2 = emp2.getEmpList();
		list1.add("John");
		list2.remove("Dev");
		
		System.out.println("emp : "+emp);
		System.out.println("emp1 : "+emp1);
		System.out.println("emp2 : "+emp2);
	}

}