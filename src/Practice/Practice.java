package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	 
	String s = "0";
	int count=0;
	int tempcount=0;
	for(int i=0;i<s.length()-1;i++) {
		if(s.charAt(i)=='1')
		{
			tempcount++;
			
		}
		else {
			if(tempcount>count) {
				count=tempcount;
				tempcount=0;
			}else 
				tempcount=0;
			
		}
	}
		System.out.println(count);
	
	}
	
	
}
