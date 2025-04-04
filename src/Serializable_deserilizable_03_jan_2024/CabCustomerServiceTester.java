package Serializable_deserilizable_03_jan_2024;

public class CabCustomerServiceTester {

	public static void main(String[] args) 
	{
		CabCustomer cust1=new CabCustomer(111,"Smith","Ameerpet","Begampet",4,"898989898");
	
	   
		CabCustomerService service = new CabCustomerService();
		
		service.addCabCustomer(cust1);
		String bill = service.printBill(cust1);
	    System.out.println(bill);
	    
	    service.addCabCustomer(cust1);
		String bill1 = service.printBill(cust1);
	    System.out.println(bill1);
	    
	    CabCustomer cust2=new CabCustomer(111,"Jhon","Ameerpet","Begampet",4,"7878787");
	    service.addCabCustomer(cust2);
		String bill2 = service.printBill(cust2);
	    System.out.println(bill2);
	    
	    CabCustomer cust3=new CabCustomer(111,"Jhon","Ameerpet","Begampet",6,"7878787");
	    service.addCabCustomer(cust3);
		String bill3 = service.printBill(cust2);
	    System.out.println(bill3);
	}

}
