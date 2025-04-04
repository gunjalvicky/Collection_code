package ArrayList_01_Jan;

import java.util.*;


public class Test8_Sort {
	public static void main(String[] args) {
		ArrayList<String> number=new ArrayList<String>();
		number.add("23");
		number.add("24");
		number.add("25");
		number.add("26");
		number.add("27");
		System.out.println("Before sorting:");
		Collections.sort(number);
		System.out.println(number);
		System.out.println("after Sorting:");
		Collections.sort(number,Collections.reverseOrder());
		System.err.println(number);
	}

}
