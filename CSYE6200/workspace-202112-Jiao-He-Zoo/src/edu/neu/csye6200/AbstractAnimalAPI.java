package edu.neu.csye6200;

public abstract class AbstractAnimalAPI {
	private String food = "Food from AbstractAnimalAPI";
	
	public String getFood() {
		return food;
	}
	public void setFood(String food) {
		this.food = food;
	}
	public abstract void eat();
	public abstract String toString();
	

}
