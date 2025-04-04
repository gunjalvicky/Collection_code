package ArrayList_01_Jan;


import java.util.ArrayList;
import java.util.List;

public class CloneCopy_ArrayList
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("ram");
		list.add("Sita");
		list.add("Lakshman");
		
		System.out.println(list);
		System.out.println(list.subList(0, 3));
		ArrayList<String> list1=new ArrayList<String>(list);
		System.out.println(list1);
		ArrayList<String> list2 =  (ArrayList<String>) list1.clone(); 
		System.out.println(list2);
		System.out.println( list2.subList(0,2));
		//to chec the given string are present in the given list
		System.out.println(list2.contains("Lakshman"));//true
		//Sublist-print the given input string
		List<String> subList = list.subList(0, 2);   
		 System.out.println(subList);
		 //that are to check even  number sodun bakiche print kara
		 ArrayList<Integer> number=new ArrayList<Integer>();
		 number.add(2);
		 number.add(4);
		 number.add(5);
		 number.add(9);
		 number.removeIf(num ->(num%2==0));
		 System.out.println(number);
		 
		 ArrayList<String> cityName= new ArrayList<String>(100);
		 cityName.add("maharastra");
		 cityName.add("maratha");
		 cityName.add("mahar");
		 cityName.add("obc");
		 cityName.add("Bhilku");
		 System.out.println(cityName);
		 //remove the start with m.
//		 cityName.removeIf(str -> (cityName.startsWith("m")));
//		 System.out.println(cityName);
		 cityName.trimToSize();
		 System.out.println("Size:"+ cityName.size());;
		 System.out.println(cityName);
		 cityName.ensureCapacity(100);
		 
		 cityName.trimToSize();
		 System.out.println("Trimed Size"+cityName.size());
		 //size of the 
		 ArrayList<Integer> num=new ArrayList<Integer>(100);
		 num.add(12);
		 num.add(13);
		 num.add(14);
		 num.add(15);
		 
		 cityName.ensureCapacity(100);
		 for(int i=0;i<50;i++)
		 {
			 num.add(i);
		 }
		System.out.println(num.size());
	}

	


}
