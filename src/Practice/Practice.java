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
 for(int i=1;i<=5;i++) {
	 for(int k=1;k<i;k++)
		 System.out.print("_");
	 for(int j=5-i;j>=0;j--)
		 System.out.print(" * ");
	 for(int h=1;h<i;h++)
		 System.out.print("_");
	 System.out.println();
 }
	}
}
