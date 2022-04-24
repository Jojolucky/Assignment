package edu.neu.csye6200;

public class AbstractCat extends AbstractAnimalAPI {
	@Override
	public void eat() {
		System.out.println("Abstract override: This cat loves eat fishs!");
			
	};
	
	@Override
	public String toString() {
		return "Abstract override: This is a cat derived from AbstractAnimalAPI";
	}

}
