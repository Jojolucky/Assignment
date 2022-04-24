package edu.neu.csye6200;

public class AbstractBird extends AbstractAnimalAPI {
	@Override
	public void eat() {
			System.out.println("Abstract override: This bird loves eat worms!");
	};
	@Override
	public String toString() {
		return "Abstract override: This is a bird derived from AbstractAnimalAPI";
	}

}
