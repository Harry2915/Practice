package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		System.out.println(isPalin(s));
	}
	public static String isPalin(String s) {
		String a ="";
		for(int i=s.length()-1;i>=0;i--)
			a+=s.charAt(i);
		if(a.equalsIgnoreCase(s))
			return "is palin";
		else
		
		
		return "not palin";
	}
}

