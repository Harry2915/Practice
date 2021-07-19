package com.controller;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class EmployeeController {
public static void main(String[] args) {
	 
	ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	    //IoC container
	    Employee employee = (Employee) factory.getBean("employee");
	   System.out.println( employee.toString());
}
}
