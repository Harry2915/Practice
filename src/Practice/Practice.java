package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	 
		String s1= "my name is Harish Hibare";
		HashMap <Character,Integer> map = new HashMap();
		String s=s1.toLowerCase();
		for(int i=0;i<s.length()-1;i++) {
			int count = 0;
			char temp=s.charAt(i);
			
			if(s.charAt(i)!='0' && s.charAt(i)!=' ') {
			for(int j=0;j<s.length()-1;j++) {
				if(s.charAt(j)==temp) {
					count++;
					s.replace(s.charAt(j), '0');
				}
			}
			}
			map.put(temp, count);
		}
		System.out.println(map);
		int max=0;
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if(entry.getValue()>max)
				max=entry.getValue();
		}
		
		for(Map.Entry<Character,Integer> entry : map.entrySet()) {
			if(entry.getValue()==max)
				System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
	
	}
	
	
}
