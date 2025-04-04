package Serialization_Deserilization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StoreObject {

	public static void main(String[] args) throws IOException 
	{
		List<Student> list = new ArrayList<Student>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("How many objects you want to save? ");
		int n = sc.nextInt();
		while(n != 0) {
			list.add(Student.getStudentobject());
			n--;
		}
		var fos = new FileOutputStream("C:\\Users\\nitin\\Documents\\Resume\\File\\Student.txt");
		var oos = new ObjectOutputStream(fos);
		
		try(fos;oos){
			oos.writeObject(list);
		}
		catch(Exception e) {
			System.err.println(e.getMessage());
		}
		System.out.println("Objects Stored in Student.txt file successfully..");
	}

}
