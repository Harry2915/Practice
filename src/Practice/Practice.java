package Practice;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.TreeSet;

public class Practice {
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int arr[] = new int[n];
    for(int i =0;i<n;i++) {
    	arr[i]=sc.nextInt();
    	
    }
 bubble_sort(arr, n);
 for (int i : arr) {
	System.out.print(i+" ");
}
    }
	public static int[] bubble_sort(int arr[], int n) {
		for(int i=0;i<n-1;i++) {
			for(int j=i+1;j<n;j++) {
				if(arr[j]<arr[i]) {
					int temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
				
			}
		}
		
		
		return arr;
	}
}
