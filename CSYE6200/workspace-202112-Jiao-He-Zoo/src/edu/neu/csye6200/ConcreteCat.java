package edu.neu.csye6200;

public class ConcreteCat extends AnimalAPI {

	@Override
	public void eat() {
		System.out.println("Concrete override: This cat loves eat fishs!");
			
	};
	
	@Override
	public String toString() {
		return "Concrete override: This is a cat derived from AnimalAPI";
	}
	
	

}
