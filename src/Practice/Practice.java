package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	 
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter the string");
	   String s = sc.nextLine();
	   System.out.println("Enter finding word");
	   String find = sc.nextLine();
	 
	   System.out.println(count1(s,find));
	 }
	public static int count1(String s, String find) {
		String arr[] = s.split(" ");
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].equalsIgnoreCase(find))
				count++;
		}
		
		
		
		return count;
	}
	
	
}
