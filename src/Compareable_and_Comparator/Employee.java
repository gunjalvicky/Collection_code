package Compareable_and_Comparator;

import java.util.ArrayList;
import java.util.Collections;

public class Employee 
{

	public static void main(String[] args)
	{
		ArrayList<Product1> list1=new ArrayList<Product1>();
		list1.add(new Product1 (23,"nikhil"));
		list1.add(new Product1 (13,"Mahesh"));
		list1.add(new Product1 (23,"Babar"));
		list1.add(new Product1 (3,"mahajan"));
		list1.add(new Product1 (43,"rajesh"));
		
		Collections.sort(list1);
		list1.forEach(System.out::println);
	}

}
