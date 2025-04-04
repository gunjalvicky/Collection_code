package HashMap;

import java.util.HashMap;

public class Tester {

	public static void main(String[] args) {
		
		HashMap<Student, String> hashmap=new HashMap<>();
		Student st=new Student(12, "Rahul", 23);
		Student st1=new Student(13, "Mahesh", 22);
		hashmap.put(st, "Student1");
		hashmap.put(st1, "Student2");
		
	}

}

//
//
////Define the record class Student
//record Student(int id, String name, int age) {
//
// // Override hashCode to generate hash code based on the id
// @Override
// public int hashCode() {
//     System.out.println("hashCode() called for Student id: " + id);
//     return Integer.hashCode(id);
// }
//
// // Override equals to compare Student objects based on id, name, and age
// @Override
// public boolean equals(Object obj) {
//     if (this == obj) return true; // Same object reference
//     if (obj == null || getClass() != obj.getClass()) return false; // Different class
//     Student other = (Student) obj;
//     boolean isEqual = this.id == other.id && this.name.equals(other.name) && this.age == other.age;
//     if (isEqual) {
//         System.out.println("equals() called: Two Student objects are considered equal");
//     }
//     return isEqual;
// }
//}
//
//import java.util.HashMap;
//
////Tester class
//public class Tester {
// public static void main(String[] args) {
//     // Create a HashMap to store Student objects
//     HashMap<Student, String> studentMap = new HashMap<>();
//
//     // Create Student objects
//     Student student1 = new Student(1, "Alice", 20);
//     Student student2 = new Student(2, "Bob", 22);
//     Student student3 = new Student(1, "Alice", 20); // Duplicate of student1
//
//     // Adding elements to the HashMap
//     System.out.println("Adding student1 to the map");
//     studentMap.put(student1, "Grade A");
//
//     System.out.println("Adding student2 to the map");
//     studentMap.put(student2, "Grade B");
//
//     System.out.println("Adding student3 to the map (duplicate key of student1)");
//     studentMap.put(student3, "Grade A+");
//
//     // Displaying the HashMap
//     System.out.println("\nContents of the HashMap:");
//     for (var entry : studentMap.entrySet()) {
//         System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
//     }
//
//     // Retrieving elements based on keys
//     System.out.println("\nRetrieving information for student1:");
//     System.out.println("Grade: " + studentMap.get(student1));
//
//     // Handling duplicates
//     System.out.println("\nDemonstrating handling of duplicates:");
//     System.out.println("Student1 and Student3 are treated as the same key due to equals() and hashCode()");
// }
//}
