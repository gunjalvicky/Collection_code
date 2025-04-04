package Vector_30DEC;
import java.util.*;
import java.util.Collections;
public class Test2 {

	public static void main(String[] args) 
	{
		Vector<Integer> str=new Vector<>(100,2);
		System.out.println(str.capacity());
		for(int i=0;i<100;i++)
		{
			str.add(i);
		}
		System.out.println(str.capacity());
		str.add(144);
		System.out.println(str.capacity());
		
		for( int i=0;i<str.size();i++)
		{
			if(i%5==0)
			{
				System.out.println();
			}
			System.out.print(str.get(i)+ "\t" );
		}
		System.out.println("\n");
		System.out.println(str.firstElement());
		System.out.println(str.lastElement());
	}

}
