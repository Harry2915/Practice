package com.controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.inter.PersonName;
import com.model.Harry;
import com.model.Head;
import com.model.Xyz;

public class App {
public static void main(String[] args) {
	ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
	
//	PersonName obj = (PersonName) applicationContext.getBean("xyz") ;
//	obj.display();
	Harry head = (Harry) applicationContext.getBean("harry");
	head.display();
}
}
