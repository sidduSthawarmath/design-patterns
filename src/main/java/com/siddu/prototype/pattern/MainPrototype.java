package com.siddu.prototype.pattern;

import java.util.List;

public class MainPrototype {
	public static void main(String[] args) throws CloneNotSupportedException {
		Employees emp=new Employees();
		emp.loadData(); //List created with [Siddu, Mahesh, Ganesh, Raghav]
		
		Employees emp1 = (Employees) emp.clone(); // data cloned getting new list
		List<String> empList1 = emp1.getEmpList();
		
		
		Employees emp2 = (Employees) emp.clone(); // data cloned getting new list
		List<String> empList2 = emp2.getEmpList();
		
		empList1.add("Suresh"); //added new data to cloned list
		System.out.println(empList1); //[Siddu, Mahesh, Ganesh, Raghav, Suresh]
		
		
		empList2.remove("Siddu");//removed existing data to cloned list
		System.out.println(empList2);  //[Mahesh, Ganesh, Raghav]


	}
}
