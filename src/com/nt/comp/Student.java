package com.nt.comp;
import com.nt.comp.Food;
public class Student extends Person {
	private int rollNo;
	private String course;
	private Food food;
	public Student(Food food) {
		System.out.println("Student::1 param Constructor");
		this.food=food;
	}

	@Override
	public void work() {
		System.out.println("Student is studying B.tech(Mech) and "+food);
	}


}
