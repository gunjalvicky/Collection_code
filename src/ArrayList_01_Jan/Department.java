package ArrayList_01_Jan;

import java.util.*;
record Professor(String name,String specilization)
{
	
}
public class Department 
{
	private String departmentName;
	private ArrayList<Professor> professors;
	
	public Department(String departmentName) 
	{
		super();
		this.departmentName = departmentName;
		this.professors=new ArrayList<Professor>();
	}
	public String getDepartment()
	{
		return departmentName;
		
	}
	public void addProfessor(Professor professor)
	{
		professors.add(professor);
	}
	public ArrayList<Professor>getProfessor()
	{
		return professors;
	}

}

