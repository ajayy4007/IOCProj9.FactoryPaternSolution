package com.nt.text;

import com.nt.comp.Employee;
import com.nt.comp.Food;
	public class SoftwareCompany {
		public static void main(String[] args) {
			//Software company needs Employee
			//Create Dependent Class Obj
			Food food=new Food();
			//Create Targst Class obj
			Employee emp=new Employee(food);
			emp.work();
		}
}
