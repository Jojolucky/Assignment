package edu.neu.csye6200;

public class ConcreteDog extends AnimalAPI{
	@Override
	public void eat() {
		System.out.println("Concrete override: This dog loves eat bones!");
			
	};
	
	@Override
	public String toString() {
		return "Concrete override: This is a dog derived from AnimalAPI";
	}

}
