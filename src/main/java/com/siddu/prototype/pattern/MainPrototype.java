package com.siddu.prototype.pattern;

import java.util.List;

public class MainPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emp=new Employees();
		emp.loadData();
		
		Employees emp1 = (Employees) emp.clone();
		List<String> empList1 = emp1.getEmpList();
		
		
		Employees emp2 = (Employees) emp.clone();
		List<String> empList2 = emp2.getEmpList();
		
		empList1.add("Suresh");
		System.out.println(empList1);
		
		
		empList2.remove("Siddu");
		System.out.println(empList2);


	}
}
