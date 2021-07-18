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
		 
		 System.out.println(ispalin(s));

		
		}
	public static String ispalin(String s) {
		String temp="";
		for(int i=s.length()-1;i>=0;i--)
			temp+=s.charAt(i);
		if(temp.equalsIgnoreCase(s))
			return "is palin";
		return "Not palin";
	}
}
