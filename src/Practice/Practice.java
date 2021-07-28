package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.next();
	String s1 = sc.next();
	System.out.println(isana(s,s1));
}
public static String isana(String s1, String s2) {
	char arr1[]=s1.toCharArray();
	char arr2[]=s2.toCharArray();
	Arrays.sort(arr1);
	Arrays.sort(arr2);
	
	if(Arrays.equals(arr1,arr2))
		return "is ana";
	else
	
	
	return "not ana";
}
}

