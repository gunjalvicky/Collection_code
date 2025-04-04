package Serialization_Deserilization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayOfList
{
	public static List<String> convertToList(String [] input)
	{ 
		/*
		 * List<String> asList = Arrays.asList(input);
		 * 
		 * return asList;
		 */
		
		List<String> list=new ArrayList<>();
		
		for(String data : input) {
			list.add(data);
		}
		
		
		return list;
	
	}
	public static void main(String[] args)
	{
		String[] input= {"rajesh","Ravan"};
		List<String> list = ArrayOfList.convertToList(input);
		System.out.println(list);
	}
}
