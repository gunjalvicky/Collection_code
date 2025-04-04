package ArrayList_01_Jan;
import java.util.*;
import java.util.Arrays;
public class Test4 {
	public static void main(String[] args) {
		List<Integer>numbers=Arrays.asList(1,2,3,4,5,6,7,8);
		numbers.set(0,3);
//		numbers.add(5);//Invalid
		System.out.println(numbers);
		
	}
	

}
