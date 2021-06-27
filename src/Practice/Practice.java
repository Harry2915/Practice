package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter strings");
	    String sc = s.nextLine();
		String sc1 = s.nextLine();
		System.out.println(isana(sc,sc1));
		
	}
    
	 public static String isana(String s,String s1) {
		 char arr[]=s.toLowerCase().toCharArray();
		 char arr2[]=s1.toLowerCase().toCharArray();
		 Arrays.sort(arr);
		 Arrays.sort(arr2);
		 if(Arrays.equals(arr, arr2))
			 return "is ana";
		 
		 return "not ana";
	 }
}
