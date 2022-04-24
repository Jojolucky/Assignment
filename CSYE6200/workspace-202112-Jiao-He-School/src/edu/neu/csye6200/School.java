package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {
	 List<Student> studentRoster = new ArrayList<>();
	 List<Person> personRoster = new ArrayList<>();
	 
	 
//	 public List<Student> getStudentRoster() {
//		return studentRoster;
//	}
//	public void setStudentRoster(List<Student> studentRoster) {
//		this.studentRoster = studentRoster;
//	}
//	public List<Person> getPersonRoster() {
//		return personRoster;
//	}
//	public void setPersonRoster(List<Person> personRoster) {
//		this.personRoster = personRoster;
//	}
	
	//add method
	public void addToStudentRoster(Student student) {
		this.studentRoster.add(student);
		 
	 }
	 public void addToPersonRoster(Person person) {
		 this.personRoster.add(person);
		 
	 }
	 
	 //sort method
	 public void sortStudentRoster(Comparator<Student> s) {
		 this.studentRoster.sort(s);
		 
	 }
	 public void sortPersonRoster(Comparator<Person> p) {
		 this.personRoster.sort(p);
		
	 }
	 
	 
	 @Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
		 sb.append("** Student **\n");
		 for(Student s:studentRoster) {
			 sb.append(s + "\n");
		 }
		 
		 sb.append("\n** Person **\n");
		 for(Person p:personRoster) {
			 sb.append(p + "\n");
		 }
		 return sb.toString();
	 }
	 
	public static void sort() {
		
		School school = new School();
		
		// add five students to studentRoster
		school.addToPersonRoster(new Person("Li",22));
		school.addToPersonRoster(new Person("Huang",23));
		school.addToPersonRoster(new Person("Sun",20));
		school.addToPersonRoster(new Person("Wang",21));
		school.addToPersonRoster(new Person("Zheng",26));
		
		// add five person to personRoster
		school.addToStudentRoster(new Student("He",20,3.7,1));
		school.addToStudentRoster(new Student("Liang",23,3.8,2));
		school.addToStudentRoster(new Student("Zhang",25,3.85,3));
		school.addToStudentRoster(new Student("Yu",22,3.82,4));
		school.addToStudentRoster(new Student("Qian",18,3.9,5));
		
		// show sort results
		System.out.println("Sort students by ID: ");
		school.sortStudentRoster(Student::compareById);
		System.out.println(school);
		

		System.out.println("Sort students by GPA: ");
		school.sortStudentRoster(Student::compareByGpa);
		System.out.println(school);
		

		System.out.println("Sort students by Last Name: ");
		school.sortStudentRoster(Student::compareByLastName);
		school.sortPersonRoster(Person::compareByLastName);
		System.out.println(school);
		

		System.out.println("Sort students by Age: ");
		school.sortStudentRoster(Student::compareByAge);
		school.sortPersonRoster(Person::compareByAge);
		System.out.println(school);
	
	}
	 

}
