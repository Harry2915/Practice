package Practice;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

public class Practice {
	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the date of appointment in \"dd/mm/yyyy\" format");
		String s = sc.next();
		
		System.out.println("Enter the time of appointment in format: hh:mm ");
		String time=sc.next();  
		LocalTime lt=LocalTime.parse(time + ":00");
		//System.out.println(lt);
		
		Calendar c = Calendar.getInstance();
		Date yourDate = new SimpleDateFormat("dd/M/yyyy").parse(s);
		c.setTime(yourDate);
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		//System.out.println(dayOfWeek);
		
		System.out.println("Select category : ");
		System.out.println("1. Dr.Harish Dental");//Available Tuesday Wed Thurs (1pm to 4pm)
	
		System.out.println("2. Dr.Sahil Dental");//Available Tuesday Wed Thurs (2pm to 4pm)
		
		System.out.println("3. Dr.Ayush Skin");//Available all days (2pm to 4pm)
		
		int category= sc.nextInt();
		int busy=1;
		
		if(category==1 && dayOfWeek<6 && dayOfWeek>1 && lt.getHour()>1 && lt.getHour()<5 && busy==1) {
			System.out.println("Appointment booked with Dr.Harish");
			busy=0;
		}else
			System.out.println("No appointment available");
		
		}
}
