package com.nt.comp;
import com.nt.comp.Food;
public class Employee extends Person {
	private String desg;
	private String salary;
	private Food food;
	//Has A property;
	public Employee(Food food)
	{
		System.out.println("Employee::1 param constructor");
		this.food=food;
	}

	@Override
	public void work() {
		System.out.println("Employee is working on softwere development and "+ food);
	}


}
