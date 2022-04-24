package edu.neu.csye6200;

public class AnimalAPI {
	private String food= "Food from AnimalAPI";
	
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public void eat() {
		System.out.println("Eat food from AnimalAPI");
			
	}

	@Override
	public String toString() {
		return "AnimalAPI type test!";
	};

	
	

}
