package ArrayList_01_Jan;

import java.util.ArrayList;

record Customer(Integer cuId,String custName,Double custFees)
{
	
}
public class Test2 
{
	public static void main(String[] args) {
		var listOfCustomer=new ArrayList<Customer>();
		listOfCustomer.add(new Customer(11,"abc",1222.0));
		listOfCustomer.add(new Customer(12,"xyz",1378.0));
		listOfCustomer.add(new Customer(222, "Smith", 123456D));
		listOfCustomer.add(new Customer(333, "Martin", 123456D));
		listOfCustomer.add(new Customer(444, "John", 123456D));
	//System.out.println(listOfCustomer);
//		listOfCustomer.forEach(x ->System.out.println(x));
	listOfCustomer.forEach(System.out::println);
	}

}
