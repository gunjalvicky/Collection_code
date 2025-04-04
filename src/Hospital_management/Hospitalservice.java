package Hospital_management;

import java.util.ArrayList;
import java.util.List;

public class Hospitalservice 
{
	private int hospitalcode=100;
	ArrayList<Hospital> hospital=new ArrayList<Hospital>();
	
	public int  addHospital()
	{
		hospitalcode++;
		hospital.add(new Hospital(hospitalName, listOfTreatments,contactPerson,
			 contactNumber,  location));
		return hospitalcode;
		
	}
	public void getHospitals()
	{
		
	}

}
