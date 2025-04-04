package Vector_30DEC;

import java.util.Collections;
import java.util.Vector;

public class Test6
{

	public static void main(String[] args) 
	{
		Vector<String> listOfCity = new Vector<>();
		listOfCity.add("Surat");
		listOfCity.add("Pune");
		listOfCity.add("Ahmadabad");
		listOfCity.add("Vanaras");
		
			
		Collections.sort(listOfCity);
		
		listOfCity.forEach(System.out::println);
		
		System.out.println(".............");
		
		Vector<Integer> listOfNumbers = new Vector<>();
		listOfNumbers.add(500);
		listOfNumbers.add(900);
		listOfNumbers.add(400);
		listOfNumbers.add(300);
		listOfNumbers.add(800);
		listOfNumbers.add(200);
		listOfNumbers.add(100);	
		
		System.out.println("Original Data...");
		System.out.println(listOfNumbers);
		
		
		System.out.println("Ascending Order...");
		Collections.sort(listOfNumbers);
		System.out.println(listOfNumbers);
		
		System.out.println("Descending Order...");
		Collections.sort(listOfNumbers, Collections.reverseOrder());
		System.out.println(listOfNumbers);
		
		//Converting Our Vector(Collection Object) into Array
		System.out.println();
		
		 Object[] cities = listOfCity.toArray();
		 
		 for(Object city : cities)
		 {
			 System.out.print(city+"\t");
		 }
		 System.out.println();
		 
		 Object[] counts=listOfNumbers.toArray();
		 
		 for(Object number:counts)
		 {
			 System.out.print(number+"\t");
		 }
		
	}

}