package Compareable_and_Comparator;

import java.util.Comparator;

public class Customer 
{
	private Integer customerNumber;
	private String customerName;
	private  Double customBill;
	public Customer(Integer customerNumber, String customerName, Double customBill) {
		super();
		this.setCustomerNumber(customerNumber);
		this.customerName = customerName;
		this.customBill = customBill;
	}
	@Override
	public String toString() {
		return "Customer [customerNumber=" + getCustomerNumber() + ", customerName=" + customerName + ", customBill="
				+ customBill + "]";
	}
	public Integer getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(Integer customerNumber) {
		this.customerNumber = customerNumber;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public Double getCustomBill() {
		return customBill;
	}
	public void setCustomBill(Double customBill) {
		this.customBill = customBill;
	}
	
	
	

}
