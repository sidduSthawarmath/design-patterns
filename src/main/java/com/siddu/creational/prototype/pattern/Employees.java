package com.siddu.creational.prototype.pattern;

import java.util.ArrayList;
import java.util.List;

/*
 * It would be easy to understand prototype design pattern with an example.
 * Suppose we have an Object that loads data from database. Now we need to
 * modify this data in our program multiple times, so it’s not a good idea
 * to create the Object using new keyword and load all the data again from
 * database.
 */


public class Employees implements Cloneable {

	List<String> empList = null;

	public Employees() {
		empList = new ArrayList<String>();
	}

	public Employees(List empList) {
		this.empList = empList;
	}

	public void loadData() {
		empList.add("Siddu");
		empList.add("Mahesh");
		empList.add("Ganesh");
		empList.add("Raghav");
	}

	public List<String> getEmpList() {
		return empList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List<String> temp = new ArrayList<String>();
		for (String name : empList) {
			temp.add(name);
		}
		return new Employees(temp);
	}

}
