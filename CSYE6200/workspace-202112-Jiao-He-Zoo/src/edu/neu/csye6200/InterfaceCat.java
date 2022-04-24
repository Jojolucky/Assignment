package edu.neu.csye6200;

public class InterfaceCat implements AnimalisticAPI {
	@Override
	public void eat() {
		System.out.println("Interface override: This cat loves eat fishs!");
			
	};
	
	@Override
	public String toString() {
		return "Interface override: This is a cat derived from AnimalisticAPI";
	}

}
