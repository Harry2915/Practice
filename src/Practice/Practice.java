package Practice;

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
		 String s1 = sc.next();		 
		 System.out.println(count(s,s1));

		
		}
	public static int count(String s, String s1) {
		String arr[]=s.split(" ");
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equalsIgnoreCase(s1))
				count++;
		}
		
		return count;
	}
}
