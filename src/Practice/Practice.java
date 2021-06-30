package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

class A implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("IN CLASS A: " +i);
		
	}
	
}

class B implements Runnable{
	
	public void run() {
		for(int i=0;i<10;i++)
			System.out.println("IN CLASS B: " +i);
		
	}
	
}

public class Practice {
	public static void main(String[] args) {
	 Thread t1 = new Thread(new A());
	 Thread t2 = new Thread(new B());
 
	 t1.start();
	 t2.start();
	
	}
	
	
}
