package Stack_31_dec;
import java.util.Stack;
public class Test4 {

	public static void main(String[] args) 
	{
		Stack<String> list = new Stack<>();
		list.add("Apple");
		list.add("banana");
		list.add("Mango");
		System.out.println(list);
		//System.out.println(list.search("Mango"));
		list.add("Grapes");
		System.out.println(list.search("Apple"));
		//System.out.println(list.indexOf("Grapes"));
		
	}

}
