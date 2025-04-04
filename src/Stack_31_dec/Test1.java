package Stack_31_dec;

import java.util.Stack;

public class Test1 
{
	public static void main(String[] args) 
	{
		Stack<Integer> list=new Stack<Integer>();
		try
		{
			list.push(12);
			list.push(34);
			list.push(24);
			list.push(44);
			list.push(54);
			System.out.println(list);
			
			System.out.println(list.pop());
			System.out.println(list.pop());
			System.out.println(list.pop());
			System.out.println(list);
			
			System.out.println(list.empty());
			Integer peek=list.peek();
			System.out.println(peek);
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
