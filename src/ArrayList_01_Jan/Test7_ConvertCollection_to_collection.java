package ArrayList_01_Jan;
import java.util.*;

public class Test7_ConvertCollection_to_collection 
{
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("Maharastra");
		list.add("hyderabad");
		list.add("karnataka");
		
		ArrayList<String> vlist=new ArrayList<String>(list);
//		Vector<String> vlist=new Vector<String>(list);
		vlist.add("parbhani");
		System.out.println(vlist);
		
	}

}
