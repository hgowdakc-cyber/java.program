package com.Acharya;

public class Student {
	int id;
	String firstName;
	String lastName;
	double fees;

	public Student(int id, String firstName, String lastName, double fees) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.fees = fees;
	}

	public String getName() {
		return firstName + " " + lastName;
	}

	public double getFees() {
		return fees;
	}

	public static void main(String[] args) {

		Student student1 = new Student(1, "Harshith", "Gowda", 100000.0);
		Student student2 = new Student(2, "Maha", "lakshmi", 120000.0);
		Student student3 = new Student(3, "Komal", "Kumar", 150000.0);

		System.out.println("Student 1:");
		System.out.println("ID: " + student1.id);
		System.out.println("Name: " + student1.getName());
		System.out.println("Fees: " + student1.getFees());

		System.out.println("**************************");

		System.out.println("Student 2:");
		System.out.println("ID: " + student2.id);
		System.out.println("Name: " + student2.getName());
		System.out.println("Fees: " + student2.getFees());

		System.out.println("**************************");

		System.out.println("Student 3:");
		System.out.println("ID: " + student3.id);
		System.out.println("Name: " + student3.getName());
		System.out.println("Fees: " + student3.getFees());
		
		System.out.println("THANK YOU");
	}
}