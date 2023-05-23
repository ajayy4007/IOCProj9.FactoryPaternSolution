package com.nt.text;

import com.nt.comp.Food;
import com.nt.comp.Student;

public class Collage {
	public static void main(String[] args) {
		//Collage needs Student
		//Create Dependent class obj
		Food food =new Food();
		//Create Target Class Obj
		Student st=new Student(food);
		st.work();
	}
}
