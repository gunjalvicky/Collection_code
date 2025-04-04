package Compareable_and_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class FisrtEx_07_Jan 
{
	public static void main(String[] args) 
	{
		ArrayList<Product> list=new ArrayList<Product>();
		
		list.add(new Product(111,"Mobile",(double)120000));
		list.add(new Product(111,"Laptop",(double)560000));
		list.add(new Product(111,"Car",(double)1200000));
		list.add(new Product(111,"Bike",(double)260000));
	
		System.out.println("sorted List");
		Collections.sort(list);
		list.forEach(System.out::println);
		
	}

}
