package TreeMap;


import java.util.TreeMap;

public class Reverse_order {

	public static void main(String[] args) 
	{
		TreeMap<Integer,String> tree=new TreeMap<Integer,String>((n1,n2)->n2.compareTo(n1));
		tree.put(10, "Ten");
		tree.put(5, "Five");
		tree.put(20, "Twenty");
		tree.put(1, "One");
		tree.put(15, "Fifteen");
		tree.forEach((k,v)->System.out.println(k+"-->"+v));
	}

}
