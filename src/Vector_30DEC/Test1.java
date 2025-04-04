package Vector_30DEC;
import java.util.*;
import java.util.Vector;
import java.util.Collections;
public class Test1 {

	public static void main(String[] args) 
	{
		Vector<String> listOfCity=new Vector<>();
		listOfCity.add("Pune");
		listOfCity.add("Mumbai");
		listOfCity.add("Hyderabad");
		listOfCity.add("Nashik");
		System.out.println("Array:");
		System.out.println(listOfCity);
		
		
		System.out.println("ASCENDING ORDER");
		Collections.sort(listOfCity);
		System.out.println(listOfCity);
		//based on index position.
		listOfCity.remove(0);
		System.out.println(listOfCity);
		//Based on object 
		listOfCity.remove("pune");
		System.out.println(listOfCity);
	}
	


}
