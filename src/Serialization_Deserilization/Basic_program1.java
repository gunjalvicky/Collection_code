package Serialization_Deserilization;

import java.util.ArrayList;
import java.io.*;


public class Basic_program1 
{
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(13);
		list.add(23);
		list.add(33);
		list.add(43);
		
		var fos=new FileOutputStream("C:\\Users\\nitin\\Documents\\Resume\\File\\Rajesh.txt");
		var oos=new ObjectOutputStream(fos);
		try(fos;oos)
		{
			oos.writeObject(list);
			System.out.println("Data Store succefully.");
		}
		catch (Exception e) {
			e.toString();
		}
		
		var fin =new FileInputStream("C:\\Users\\nitin\\Documents\\Resume\\File\\Rajesh.txt");
		var ois=new ObjectInputStream(fin);
		try(fin;ois)
		{
			ArrayList<Integer>list1=(ArrayList<Integer>) ois.readObject();
			System.out.println(list1);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
