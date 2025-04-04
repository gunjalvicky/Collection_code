package ArrayList_01_Jan;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class Test6 {

	public static void main(String[] args) {

		List<String> list=Arrays.asList("vaibhav","mohan","gaurav","sai","shubham");
		Collections.sort(list);
		ListIterator<String> first=list.listIterator();
		System.out.println("In the forward Direction");
		while(first.hasNext())
		{
			System.out.println(first.next());
		}
		System.out.println("In backword Direction");
		while(first.hasPrevious())
		{
			System.out.println(first.previous());
		}
	}

}
