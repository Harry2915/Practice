package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Employee;

public class EmployeeController {
public static void main(String[] args) {
	

	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	Employee employee = (Employee) applicationContext.getBean("employee");
     System.out.println(employee.toString());
}
}