package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int count=0;
	for(int i=1;i<=100;i++) {
		int a=i;
		
		if(isPrime(a).equals(" is prime"))
			count++;
		System.out.println(a+ " " +isPrime(a));
	}
	System.out.println();
	System.out.println(count);
	
	}
	
	public static String isPrime(int a) {
	
		if(a==0||a==1)
			return "not prime";
		for(int i=2;i<a;i++) {
			if(a%i==0) 
				return "not prime";
			
			
		}
		
		
		
		return " is prime";
	}
}
