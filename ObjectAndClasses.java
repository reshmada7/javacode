package com.PracticeJava;

import com.Reshma.Testjavaclass;

public class ObjectAndClasses {
	public static void main(String[] args) {
		
		Employee emp =new Employee();
		emp.emp_id=10;
		emp.emp_name="Reshma";
		emp.emp_designation="QA Engineer";
		emp.salary=60000;
		System.out.println(emp);
		emp.display();
		Testjavaclass test =new Testjavaclass();
		System.out.println(test);
		
		Testjavaclass.main(new String[]{});
	}
	
}
