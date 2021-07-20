package com.model;

import org.springframework.stereotype.Component;

import com.inter.PersonName;
@Component
public class Xyz implements PersonName{
public void display() {
	System.out.println("My name is xyz");
}
}
