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
	int h=1;
for(int i=1;i<=10;i+=2)
{
	for(int k=h;k<5;k++) {
		System.out.print(" ");
	}
	
	for(int j=0;j<i;j++)
		System.out.print("*");
	
	System.out.println();
	h++;
}
 }
	
}
