package Compareable_and_Comparator;

public record Product1(Integer employeeId,String employeeName)  implements Comparable<Product1>
{

	@Override
	public int compareTo(Product1 o)
	{
		return this.employeeId.compareTo(o.employeeId);
	}
}
