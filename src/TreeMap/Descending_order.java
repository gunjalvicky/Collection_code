package TreeMap;



import java.util.*;
import java.util.Map.Entry;

public class Descending_order {

//	public static void main(String[] args) 
//	{
//		TreeMap<Integer,String>treemap =new TreeMap<Integer,String>((n1,n2)->n2.compareTo(n1));
//		treemap.put(10, "Ten");
//		treemap.put(-5, "Five");
//		treemap.put(-20, "Twenty");
//		treemap.put(1, "One");
//		treemap.put(15, "Fifteen");
//		treemap.forEach((k,v)->System.out.println(k));
//		
//	}
	
	public static void main(String[] args) {
		WeakHashMap<Integer, String> map=new WeakHashMap<Integer, String>();
		map.put(null, null);
		HashMap<Integer, String> map1=new HashMap<Integer,String>();
		map1.put(null, null);
		System.out.println(map);
		System.out.println(map1);
		
	}
}

