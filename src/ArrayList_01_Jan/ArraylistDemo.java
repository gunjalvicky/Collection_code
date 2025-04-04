package ArrayList_01_Jan;

import java.util.ArrayList;

public class ArraylistDemo {

	public static void main(String[] args) {
		Department dept=new Department("Computer Science");
		
		dept.addProfessor(new Professor("James", "Java"));
		dept.addProfessor(new Professor("Martin", "Python"));
		dept.addProfessor(new Professor("Scott", ".Net"));
		dept.addProfessor(new Professor("Smith", "Adv. Java"));
		dept.addProfessor(new Professor("Martin", "Python"));
		dept.addProfessor(new Professor("Scott", ".Net"));
		dept.addProfessor(new Professor("Smith", "Adv. Java"));
		dept.getDepartment();
		
		System.out.println( dept.getDepartment());
		ArrayList<Professor> list=dept.getProfessor();
		list.forEach(x-> System.out.println(x));
	}

}
