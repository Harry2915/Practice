package com.controller;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.model.Employee;

public class EmployeeController {
public static void main(String[] args) {
	 
	ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
	    //IoC container
	    Employee employee = (Employee) factory.getBean("e");
	   System.out.println( employee.toString());
}
}
