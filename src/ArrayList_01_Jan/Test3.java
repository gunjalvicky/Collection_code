package ArrayList_01_Jan;
import java.util.*;

public class Test3 
{
	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(12);
		list.add(22);
		list.add(32);
		list.add(42);
		System.out.println(list);
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		list1.add(13);
		list1.add(12);
		list1.add(32);
		System.out.println(list1);
		
//		list.addAll(list1);
//		System.out.println(list);
		list.retainAll(list1);
		list.forEach(x->System.out.println(x));
	}
	
}
