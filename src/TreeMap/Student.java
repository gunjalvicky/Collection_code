package TreeMap;


import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Student 
{
	
	public static void main(String[] args) 
	{
		TreeMap<String, Integer> student=new TreeMap<String, Integer>();
		student.put("sanket", 89);
		student.put("rahul", 90);
		student.put("swapnil",91);
		System.out.println(student);
		Set<Entry<String, Integer>>std=student.entrySet();
		
		for(Entry<String,Integer>ent:std)
		{
			System.out.println(ent.getKey()+"->" +ent.getValue());
			
		}
	
		
	}

}
