package Serialization_Deserilization02_dec;

import java.io.*;
import java.util.*;

public class Directory 
{
	
	ArrayList<Employee> employee=new ArrayList<Employee>();
	public void addEmployee(List<Employee >employee) throws IOException
	{
		var fos=new FileOutputStream("C:\\Users\\nitin\\Documents\\Resume\\File\\Employee.txt");
		var oos=new ObjectOutputStream(fos);
		try(fos;oos)
		{
			oos.writeObject(employee);
			System.out.println("Your employee data is Successfully loaded.");
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
	public void displayAllEmployee() throws IOException
	{
		var fis=new FileInputStream("C:\\Users\\nitin\\Documents\\Resume\\File\\Employee.txt");
		var ois=new ObjectInputStream(fis);
		try(fis;ois)
		{
			List <Employee> list= (List<Employee>)ois.readObject();
			
			if(index>=0 && index<list.size())
			{
				list.remove(index);
				var fos=new 
			}
		}
	}
	
	employee.add(new Employee("Mahesh","Developer",45000.00));
	employee.add((new Employee("sanket","Tester",34000.00));
	
	
	public void addEmployee()
	{
		
	}

}
