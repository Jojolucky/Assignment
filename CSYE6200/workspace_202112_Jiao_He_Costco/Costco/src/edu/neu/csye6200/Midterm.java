package edu.neu.csye6200;
import java.io.IOException;

/**
 * * TOTAL POINTS: 100
 * 
 * Student TODO:
 * 
 * 2 POINTS Create a class ConvertUtility with methods for conversion of String
 * representation of numerical values WITH EXCEPTION HANDLING into their correct
 * numerical data types 8 POINTS Create a class ItemAPI
 * 
 * 2 POINTS Derive a class Durable from ItemAPI (attributes of weight, weight
 * units) 8 POINTS Create a class DurableFactory (lazy singleton GoF Factory
 * method pattern)
 * 
 * 2 POINTS Derive a class Service from ItemAPI (attributes of start time, end
 * time, time units) 8 POINTS Create a class ServiceFactory (eager singleton GoF
 * Factory method pattern)
 * 
 * 2 POINTS Derive a class Costco derived from Abstract class StoreAPI 8 POINTS
 * Create a Costco static demo method to 1) add the following items (CSV) USING
 * FACTORIES AND IN FOLLOWING ORDER:
 * 
 * "2,3.49,OJ,Tropicana Oriage Juice", "1,2.49,Cheese,Provolone cheese",
 * "3,1.49,Milk,Almond Milk", "4,0.89,Snack,Mounds chocolate bar"
 * "6,384.49,Treadmill,Voyager Pro Treadmill,98.3,kg", "5,12.49,Chair,folding
 * chair,2.89,Lbs", "7,101.49,Mattress,Air Mattress,27.6,kg",
 * "8,6.89,Slippers,bath slippers,2.5,oz"
 *
 *
 * 4 POINTS SORT all items BY ID ASCENDING AND DESCENDING (in Costco static demo
 * method) 4 POINTS SORT all items BY PRICE ASCENDING AND DESCENDING (in Costco
 * static demo method)
 * 
 * 4 POINTS SORT all items BY NAME ASCENDING AND DESCENDING (in Costco static
 * demo method) 3 POINTS SORT all items BY DESCRIPTION ASCENDING AND DESCENDING
 * (in Costco static demo method)
 * 
 * 
 * Using this Midterm class, complete the code to meet all the requirements
 * (Student TODO) ...
 * 
 * 
 * 5 POINTS: demonstrate use of static data 5 POINTS: demonstrate use of
 * immutable data
 * 
 * 10 POINTS: demonstrate Object Oriented Principle of Abstraction 5 POINTS:
 * demonstrate Object Oriented Principle of Encapsulation 10 POINTS: demonstrate
 * Object Oriented Principle of Inheritance 10 POINTS: demonstrate Object
 * Oriented Principle of Polymorphism
 * 
 * 
 * @author dgpeters
 *
 */
public class Midterm {
	/**
	 * Student TODO: complete the implementation of the required methods in demo()
	 * called here by Driver main() method
	 * 
	 * @param args
	 */

	static String staticName = "MidtermExam";
	final int immutableData = 10;

	public void bark() {
		System.out.println("Animals make sound when they bark!");
	}

	public void convertWeight(int x) {
		double y = 2.2 * x;
		System.out.println(x + " KG equals " + y + " Lbs.");
	}

	public static void demo() throws IOException {
		System.out.println(Midterm.class.getName() + ".main()...");
		Midterm obj = new Midterm();
		obj.demoAbstraction(); // Student TODO implementation
		obj.demoEncapsulation(); // Student TODO implementation
		obj.demoInheritance(); // Student TODO implementation
		obj.demoPolymorphism(); // Student TODO implementation
		obj.demoStaticData(); // Student TODO implementation
		obj.demoImmutableData(); // Student TODO implementation
		
	}

	/**
	 * Student TODO: using this class, demonstrate the Object Oriented Principle of
	 * Abstraction BOTH a. data hiding b. functionality hiding
	 */
	public void demoAbstraction() {
		System.out.println("\n\t demoAbstraction...");
		/**
		 * Student TODO: complete implementation
		 */
		Person p1 = new Student(1, "Jojo", 21);
		Person p2 = new Student(2, "Diandian", 18);
		Person p3 = new Student(3, "Jimmy", 20);
		p1.show();
		p2.show();
		p3.show();

	}

	/**
	 * Student TODO: using this class, demonstrate the Object Oriented Principle of
	 * Encapsulation
	 */
	public void demoEncapsulation() {
		System.out.println("\n\t demoEncapsulation...");
		/**
		 * Student TODO: complete implementation
		 */
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("Jojo He");
		s1.setAge(18);
		s2.setName("Diandian");
		s2.setAge(8);
		System.out.println("【Encapsulation】 Name : " + s1.getName() + ", Age : " + s1.getAge());
		System.out.println("【Encapsulation】 Name : " + s2.getName() + ", Age : " + s2.getAge());
		
	}

	/**
	 * Student TODO: using this class, demonstrate the Object Oriented Principle of
	 * Inheritance
	 */
	public void demoInheritance() {
		System.out.println("\n\t demoInheritance...");
		/**
		 * Student TODO: complete implementation
		 */
		int a = 10;
		Distance convert = new Distance();
		System.out.println("This is the method of the Subclass:");
		convert.convertDistance(a);
		System.out.println("\n【Inheritance】 This is the method from its Parent Class:");
		convert.convertWeight(a); // from Midterm class
	}

	/**
	 * Student TODO: using this class, demonstrate the Object Oriented Principle of
	 * Polymorphism
	 */
	public void demoPolymorphism() {
		System.out.println("\n\t demoPolymorphism...");
		/**
		 * Student TODO: complete implementation
		 */
		Midterm animal = new Midterm();
		Midterm cat = new Cat();
		Midterm dog = new Dog();
		animal.bark();
		cat.bark();
		dog.bark();
	}

	/**
	 * Student TODO: using this class, demonstrate the use of static data
	 */
	public void demoStaticData() {
		System.out.println("\n\t demoStaticData...");
		/**
		 * Student TODO: complete implementation
		 */
		System.out.println("Static data: " + Midterm.staticName);
	}

	/**
	 * Student TODO: using this class, demonstrate the use of immutable data
	 */
	public void demoImmutableData() {
		System.out.println("\n\t demoImmutableData...");
		/**
		 * Student TODO: complete implementation
		 */
		System.out.println("Immutable data: " + this.immutableData);
	}
}
