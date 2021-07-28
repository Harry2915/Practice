package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int h = sc.nextInt();
	int a=0,b=1,c=a+b,i=1;
	System.out.print("0 ");
	while(i!=h) {
		System.out.print(c+" ");
		b=a;
		a=c;
		
		c=a+b;
		i++;
	}
}
}

