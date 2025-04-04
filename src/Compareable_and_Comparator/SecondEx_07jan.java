package Compareable_and_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SecondEx_07jan  
{

	public static void main(String[] args) 
	{
		ArrayList<Customer> list =new ArrayList<Customer>();
		list.add(new Customer(14,"Mahesh",230.00));
		list.add(new Customer(15,"sai",20.00));
		list.add(new Customer(10,"nikhil",130.00));
		list.add(new Customer(1,"naikhil",40.00));
		System.out.println("-------------------Original Data--------------------------------");
		list.forEach(System.out::println);
		System.out.println("\n-------------------Compare Id------------------------------------");
		Collections.sort(list,(l1,l2)->l1.getCustomerNumber().compareTo(l2.getCustomerNumber()));
		list.forEach(System.out::println);
		System.out.println("\n-------------------comapare Name --------------------------------");
		Collections.sort(list,(l1,l2)->l1.getCustomerName().compareTo(l2.getCustomerName()));
		list.forEach(System.out::println);
		System.out.println("\n-------------------Comapaire bill---------------------------------");
		Collections.sort(list,(l1,l2)->l1.getCustomBill().compareTo(l2.getCustomBill()));
		list.forEach(System.out::println);
		
		
		

	}

}
