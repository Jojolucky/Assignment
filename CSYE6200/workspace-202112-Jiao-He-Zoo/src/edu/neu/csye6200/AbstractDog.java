package edu.neu.csye6200;

public class AbstractDog extends AbstractAnimalAPI {
	@Override
	public void eat() {
		System.out.println("Abstract override: This dog loves eat bones!");
			
	};
	@Override
	public String toString() {
		return "Abstract override: This is a dog derived from AbstractAnimalAPI";
	}

}
