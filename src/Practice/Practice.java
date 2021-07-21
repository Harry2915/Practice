package Practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Practice {



	public static void main(String[] args)  {
	List<String> arrayList= new ArrayList<String>();
	
	int stm =1;
	while(stm==1) {
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter File Name:");
	String s = sc.nextLine();

	System.out.println("Select file type");
	System.out.println("(1)*.txt");
	System.out.println("(2)*.java");
	System.out.println("(3)*.png");
	System.out.println("(4)*.jpeg");
	
	int i = sc.nextInt();
	
	switch (i) {
	case 1:     
		String temp=s+".txt";
		if(arrayList.contains(temp))
		{
			
			int count=0;
			for (String string : arrayList) {
				if(string.equals(temp))
					count++;
				temp=s+count+".txt";
			}
			String temp2=s+count+".txt";
			arrayList.add(temp2);
		}
		else
			arrayList.add(temp);
		break;
	case 2:
		String temp1=s+".java";
		if(arrayList.contains(temp1))
		{
			int count2=0;
			for (String string : arrayList) {
				if(string.equals(temp1))
					count2++;
				temp1=s+count2+".java";
			}
			String temp2=s+count2+".java";
			arrayList.add(temp2);
		}
		else
			arrayList.add(temp1);
		break;
		
	case 3:String tem=s+".png";
	if(arrayList.contains(tem))
	{
		int count=0;
		for (String string : arrayList) {
			if(string.equals(tem))
				count++;
			tem=s+count+".png";
		}
		String temp2=s+count+".png";
		arrayList.add(temp2);
	}
	else
		arrayList.add(tem);
	break;
	case 4:
		String tem1=s+".jpeg";
		if(arrayList.contains(tem1))
		{
			int count=0;
			for (String string : arrayList) {
				if(string.equals(tem1))
					count++;
				tem1=s+count+".jpeg";
			}
			String temp2=s+count+".jpeg";
			arrayList.add(temp2);
		}
		else
			arrayList.add(tem1);
		break;
		
	default:
		break;
		
	}
	System.out.println("Want to add more files?");
	System.out.println("1.Yes");
	System.out.println("2.No");
	int stm1=sc.nextInt();
	if(stm1!=1)
		stm=0;
	}
	System.out.println(arrayList);
}
 
}
