package edu.neu.csye6200;

public class ConcreteBird extends AnimalAPI{
	@Override
	public void eat() {
		System.out.println("Concrete override: This bird loves eat worms!");
			
	};
	
	
	@Override
	public String toString() {
		return "Concrete override: This is a bird derived from AnimalAPI";
	}


}
