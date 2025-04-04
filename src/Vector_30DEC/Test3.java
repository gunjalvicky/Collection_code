package Vector_30DEC;

import java.util.Vector;
import java.util.Collections;
import java.util.*;
public class Test3 {

	public static void main(String[] args) 
	{
		Vector<Integer> str1=new Vector<>();
		int[] x= {22,34,53,42,23,6,67,86,90};
		
		for(int i=0;i<x.length;i++)
		{
			str1.add(x[i]);
		}
		Collections.sort(str1);
		System.out.println(str1);
		//Max
		System.out.println(Collections.max(str1));
		//min
		 System.out.println( Collections.min(str1));
		 str1.forEach(y-> System.out.print(y+"\t"));
		 Collections.reverse(str1);
		 System.out.println();
		 str1.forEach(y->System.out.print(y+"\t"));
		 System.out.println();
		

	}

}
