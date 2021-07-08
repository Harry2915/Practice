package Practice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int size = sc.nextInt();
			int rotation = sc.nextInt();
			int arr[] = new int[size];
			for(int i=0;i<size;i++)
				arr[i]=sc.nextInt();
			for(int j=size-rotation;j<size;j++)
				System.out.print(arr[j] + " ");
			for(int k=0;k<size-rotation;k++)
				System.out.print(arr[k] + " ");
	}
}
