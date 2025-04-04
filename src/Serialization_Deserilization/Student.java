package Serialization_Deserilization;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Scanner;

public class Student implements Serializable {
	private Integer studentId;
	private String studentName;
	private double studentFees;
	private LocalDate dateOfAdmission;

	public Student(Integer studentId, String studentName, double studentFees, LocalDate dateOfAdmission) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentFees = studentFees;
		this.dateOfAdmission = dateOfAdmission;
	}

	public static Student getStudentobject() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the StudentID:");
		Integer studentId = Integer.parseInt(sc.nextLine());
		System.out.println("Enter the StudentName:");
		String studeName = sc.nextLine();
		System.out.println("Enter the Student Fees");
		double studentFees = Double.parseDouble(sc.nextLine());
		System.out.println("Enter the Student admition Date(yyyy-mm-dd): ");
		int year = Integer.parseInt(sc.nextLine());
		int month = Integer.parseInt(sc.nextLine());
		int day = Integer.parseInt(sc.nextLine());
		LocalDate dateOfAdmission = LocalDate.of(year, month, day);

		return new Student(studentId, studeName, studentFees, dateOfAdmission);

	}

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public double getStudentFees() {
		return studentFees;
	}

	public void setStudentFees(double studentFees) {
		this.studentFees = studentFees;
	}

	public LocalDate getDateOfAdmission() {
		return dateOfAdmission;
	}

	public void setDateOfAdmission(LocalDate dateOfAdmission) {
		this.dateOfAdmission = dateOfAdmission;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentFees=" + studentFees
				+ ", dateOfAdmission=" + dateOfAdmission + "]";
	}

}
