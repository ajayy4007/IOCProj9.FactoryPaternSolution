package com.nt.factory;
import com.nt.comp.Food;
import com.nt.comp.Person;
import com.nt.comp.Employee;
import com.nt.comp.Student;
public class PersonFactory{
		//static factory method (having logic of factory pattern)
		public static Person getPerson(String type) {
			//Create Dependent class obj
			Food food=new Food();
			//Create Target class obj
			Person per=null;
			if(type.equalsIgnoreCase("emp"))
				per=new Employee(food);
			else if(type.equalsIgnoreCase("stud"))
				per=new Student(food);
				else
					throw new IllegalArgumentException("invlid person type");
			return per;
	}
	}
