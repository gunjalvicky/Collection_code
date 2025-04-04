package Vector_30DEC;
import java.util.*;
import java.util.Collections;
//Working with Custom object
public class Test4 {

	record laptops(String brand ,Integer price)
	{
		
	}
	public static void main(String[] args) 
	{
		Vector<laptops>listOfLaptops=new Vector<>();
		listOfLaptops.add(new laptops("Hp",56000));
		listOfLaptops.add(new laptops("Realme",46000));
		listOfLaptops.add(new laptops("Lenova",52000));
		listOfLaptops.add(new laptops("mac",100000));
		listOfLaptops.forEach(product ->System.out.println(product));
		

	}

}

//import java.util.Vector;
//
//record MobileProduct(Integer productId, String productName)
//{	
//}
//
//public class Test4
//{
//  public static void main(String[] args) 
//  {
//		Vector<MobileProduct> listOfProducts = new Vector<>();
//		listOfProducts.add(new MobileProduct(444, "Apple"));
//		listOfProducts.add(new MobileProduct(111, "Redmi"));
//		listOfProducts.add(new MobileProduct(222, "Vivo"));
//		listOfProducts.add(new MobileProduct(333, "Oppo"));
//		
//		listOfProducts.forEach(prod -> System.out.println(prod));
//	
//  }
//}
