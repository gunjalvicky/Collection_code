package ArrayList_01_Jan;

import java.util.ArrayList;

public class Test1 
{
	public static void main(String[] args) throws InterruptedException 
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(23);
		list.add(33);
		list.add(43);
		list.add(73);
		int sum=0;
		for(int num:list)
		{
			sum+=num;
		
		}
		System.out.println(sum);
		
		
	}

}
