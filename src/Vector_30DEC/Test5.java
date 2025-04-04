package Vector_30DEC;
import java.util.*;
import java.util.Collections;
//ArrayList are faster as compaire to the Vector
public class Test5 
{

	public static void main(String[] args)
	{
		Vector<Integer> Country=new Vector <>();
		long startTime=System.currentTimeMillis();
		for(int i=0;i<1000000;i++)
		{
			Country.add(i);
		}
		long endtime=System.currentTimeMillis();
		long totalTime=endtime-startTime;
		System.out.println(totalTime+ " ms");
		
		ArrayList<Integer> array=new ArrayList <>();
		long startTime1=System.currentTimeMillis();
		for(int i=0;i<100000;i++)
		{
			array.add(i);
			
		}
		long endtime1=System.currentTimeMillis();
		long totalTime1=endtime1-startTime1;
		System.err.println(totalTime1+" ms");

	}

}
