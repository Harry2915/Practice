package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(countword(s));
		HashMap<Character, Integer> map= new HashMap<Character, Integer>();
		map.putAll(countword(s));
		int max=0;
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			
			if(m.getValue()>max)
				max=m.getValue();
		}
		for(Map.Entry<Character, Integer> m : map.entrySet()) {
			if(m.getValue()==max)
				System.out.println(m.getKey()+" "+m.getValue());
		}
	}
public static HashMap<Character, Integer> countword(String s){
	HashMap<Character, Integer> map = new HashMap<Character, Integer>();
	for(int i=0;i<s.length();i++) {
		
		if(s.charAt(i)!='0' && s.charAt(i)!=' ') {
			int count=0;
		char temp=s.charAt(i);
		for(int j=0;j<s.length();j++) {
			if(s.charAt(j)==temp && s.charAt(j)!='0') {
				count++;
				s.replace(s.charAt(j), '0');
				
				
			}
			
		}
		map.put(temp, count);
	}}
	
	
	
	
	
	return map;
}
	
	
	
	
}
