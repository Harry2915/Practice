package Practice;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the string");
		String s1= s.nextLine();
		System.out.println(ispalin(s1));
	}
	public static String ispalin(String s) {
		String s1 ="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		if(s.equalsIgnoreCase(s1))
			return "is palin";
		else
		
		
		return "not palin";
	}
}
