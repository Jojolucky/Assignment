package edu.neu.csye6200;

public class Student extends Person {
	public double gpa;
	public int id;
	
	public Student(String lastName, int age, double gpa, int id) {
		super(lastName,age);
		this.gpa = gpa;
		this.id = id;
		
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Student: ID = " + id + ", Last Name= " + lastName + ", Age = " + age + ", GPA = " + gpa;
	}
	// compare
	public static int compareByGpa(Student t1, Student t2) {
		return Double.compare(t1.getGpa(), t2.getGpa());
		
	}
	
	public static int compareById(Student t1, Student t2) {
		return Integer.compare(t1.getId(), t2.getId());
	}
	
	
	

}
