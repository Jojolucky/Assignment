package edu.neu.csye6200;

public class Person {
	public int age;
	public String lastName;
	
	
	public Person(String lastName,int age) {
		this.age = age;
		this.lastName = lastName;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	@Override
	public String toString() {
		return "Person: Last Name= " + lastName + ", Age = " + age; 
	}
	//compare
	public static int compareByAge(Person p1, Person p2) {
		return Integer.compare(p1.getAge(),p2.getAge());
	}
	
	public static int compareByLastName(Person p1, Person p2) {
		return p1.getLastName().compareTo(p2.getLastName());
		
	}
	

}
