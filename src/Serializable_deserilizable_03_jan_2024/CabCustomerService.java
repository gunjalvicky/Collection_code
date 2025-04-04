package Serializable_deserilizable_03_jan_2024;

import java.util.ArrayList;
import java.util.List;

public class CabCustomerService 
{
	private List<CabCustomer> cabCustomerlist=new ArrayList<CabCustomer>();;
	
	public void addCabCustomer(CabCustomer cabCust )
	{
		cabCustomerlist.add(cabCust);//
	}

	public boolean isFirstCustomer(CabCustomer cabCust) {
		
		int count=0;
		
		for(CabCustomer cust : cabCustomerlist) {
			if(cust.getPhone().equals(cabCust.getPhone())) {
				count++;
			}
		}
		
		return count>1 ? false : true;
	}
	
	public double calculateBill(CabCustomer cabCust) {
		
		double bill=0;
		if(isFirstCustomer(cabCust)) {
			
			return bill;
		}
		else if(cabCust.getDistance()<4) {
			return 80;
		}
		else {
			bill=80+(cabCust.getDistance()-4)*6;
			return bill;
		}
	}
	
	public String printBill(CabCustomer cabCust) {
		
		   return cabCust.getCustomerName()+" Please pay your bill of : Rs. "+calculateBill(cabCust);
	}
}
