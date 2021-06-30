package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class A extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("in class A: "+i);
	}
}

class B extends Thread{
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("IN CLASS B: "+i);
	}
}

public class Practice {
	public static void main(String[] args) {
	A a = new A();
	B b = new B();
	a.start();
	b.start();
	
	}
	
	
}
