package Practice;

import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Practice {
	public static void main(String[] args)  {
		 Scanner sc = new Scanner(System.in);
		 String s = sc.nextLine();
		 String s1 = sc.nextLine();		 
		 System.out.println(is_ana(s,s1));

		
		}
	public static String is_ana(String s, String s1) {
		
		String arr[]=s.toLowerCase().split("");
		String arr1[]=s1.toLowerCase().split("");
		Arrays.sort(arr);
		
		Arrays.sort(arr1);
	if(Arrays.equals(arr, arr1))
		return "is ana";
	else
	return "not ana";
		
	}
}
