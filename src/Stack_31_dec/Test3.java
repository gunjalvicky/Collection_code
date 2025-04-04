package Stack_31_dec;

import java.util.Stack;

public class Test3 {

	public static void main(String[] args) 
	{
			Stack<String> list=new Stack<>();
			list.add("raju");
			list.add("rajesh");//raju  rajesh
		//	list.peek(); -Invalid
			String peek=list.peek();
			System.out.println(peek);//rajesh
			list.forEach(x ->System.out.println(x));
			
	}

}
