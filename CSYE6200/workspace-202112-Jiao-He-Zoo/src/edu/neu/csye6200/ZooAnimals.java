package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnimals {

	List<AnimalAPI> animals= new ArrayList<>();
	
	public void add(AnimalAPI a) {
		this.animals.add(a);
	}
	
	public void eat() {
		for (AnimalAPI obj : animals) {
			obj.eat();;
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		System.out.println("\nZooAnimals @Override toString: \n");
		for (AnimalAPI obj : animals) {
			sb.append(obj.toString()).append(" \n");
		}
		return  sb.toString();
	}

	public static void show() {
		
		ZooAnimals z = new ZooAnimals();
		System.out.println("\n********  Show Concrete ******** \n");
		ConcreteBird cBird = new ConcreteBird();
		ConcreteCat cCat = new ConcreteCat();
		ConcreteDog cDog = new ConcreteDog();
	
		z.add(cCat);
		z.add(cBird);
		z.add(cDog);
		System.out.println("@Override eat method \n");
		z.eat();
		System.out.println(z);
	
	}

}
