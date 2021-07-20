package com.model;

import org.springframework.stereotype.Component;

@Component
public class Head {
  String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "Head [name=" + name + "]";
}
  
}
