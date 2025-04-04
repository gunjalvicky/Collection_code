package Jan_06_01_2025;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class StudentManagement {
	private Set<String> student = new HashSet<>();

	public void addStudent(String Name) {
		boolean a = student.add(Name);
		if (a) {
			System.out.println("Student name " + Name + " added successfully..");
		} else if (student.contains(Name)) {
			System.out.println("Student name is already Exist.");
		}
	}

	public void removeStudent(String Name) {
		boolean r = student.remove(Name);
		if (r) {
			System.out.println("Student Name " + Name + " remove a successfully");
		} else {
			System.out.println("student was not found if the name does not exist in the set.");
		}
	}

	public void displayStudent() {
		if (student.isEmpty()) {
			System.out.println("Prints a message if there are no students.");
		} else {
			System.out.println(student);
		}

	}

	public static void main(String[] args) {
		StudentManagement std = new StudentManagement();
		Scanner sc = new Scanner(System.in);
		int choice;
		while (true) {
			System.out.println("Choose a Appropriate Option:-\n" + "1) Add a student.\n" + "2) Remove a student\n"
					+ "3) Display the Student Information\n" + "4) exit\n");
			System.out.println("Enter the Choice:");

			choice = Integer.parseInt(sc.nextLine());
			if (choice > 0 && choice < 5) {
				switch (choice) {
				case 1:
					System.out.println("Sudent Name:");
					String stdname = sc.nextLine();
					
					std.addStudent(stdname);
					break;
				case 2:
					System.out.println("Remove Student Name:");
					String remove = sc.nextLine();
					
					std.removeStudent(remove);
					break;
				case 3:
					std.displayStudent();
					break;
				case 4:
					System.out.println("Exited.");
					System.exit(choice);
				}
			} else {
				System.err.println("Error.... Invalid choice \n please appropriate choice are choosen.");
			}
		}

	}

}
