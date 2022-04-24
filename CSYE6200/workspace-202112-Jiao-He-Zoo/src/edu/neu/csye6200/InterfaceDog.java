package edu.neu.csye6200;

public class InterfaceDog implements AnimalisticAPI {
	@Override
	public void eat() {
		System.out.println("Interface override: This dog loves eat bones!");
			
	};
	
	@Override
	public String toString() {
		return "Interface override: This is a dog derived from AnimalisticAPI";
	}

}
