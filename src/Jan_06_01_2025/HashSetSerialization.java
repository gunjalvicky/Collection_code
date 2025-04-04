package Jan_06_01_2025;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;

public class HashSetSerialization 
{
	public static void serializeHashSet(HashSet<String> set, String filename) throws IOException 
	{
		try {
			var fos=new FileOutputStream(filename);
			var oos=new ObjectOutputStream(fos);
			oos.writeObject(set);
			System.out.println("Stored successfully..");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	public static HashSet<String> deserializeHashSet(String filename) throws IOException 
	{
		var fis=new FileInputStream(filename);
		var ois=new ObjectInputStream(fis);
		HashSet<String> list =new HashSet<String>();
		
		try {
			    list=(HashSet<String>)ois.readObject();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public static void main(String[] args) throws IOException
	{
		HashSet<String> list =new HashSet<String>();
		list.add("Student Details");
		list.add("Class ");
		list.add("Division");
		String filename="C:\\Users\\nitin\\Documents\\Resume\\File\\06Jan.txt";
		HashSetSerialization.serializeHashSet(list, filename);
		System.out.println(HashSetSerialization.deserializeHashSet(filename));
		
		
	}
}
