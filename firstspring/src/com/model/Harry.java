package com.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.inter.PersonName;
@Component

public class Harry implements PersonName{
	@Autowired
	Head head;
	
 public Head getHead() {
		return head;
	}

	public void setHead(Head head) {
		this.head = head;
	}

public void display() {
	 System.out.println("My name is Harry and Heaad is" + head);
 }
}
