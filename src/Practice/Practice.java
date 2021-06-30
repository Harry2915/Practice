package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
	Address address = new Address();
	ArrayList<Address> list = new ArrayList<Address>();
	Scanner sc = new Scanner(System.in);
	while(true) {
		System.out.println("Enter House no: ");
		address.setHouse_no(sc.nextInt());
		sc.nextLine();
		System.out.println("Enter street name: ");
		address.setStreet(sc.nextLine());
		System.out.println("Enter city name: ");
		address.setCity(sc.next());
		System.out.println("Enter state Name: ");
		address.setState(sc.next());
		System.out.println("Enter district name: ");
		address.setDistrict(sc.next());
		System.out.println("Enter Pin code: ");
		address.setPin(sc.nextInt());
		list.add(address);
		System.out.println("...........SUCCESS............");
		System.out.println();
		System.out.println("Do you want to continue? (1/0)");
		int c = sc.nextInt();
		if(c==1)
			continue;
		else {
			System.out.println("Exited");
			break;
		}
			
		
	}
	System.out.println(list);
	}
	
	
}
