package edu.neu.csye6200;

public class InterfaceBird implements AnimalisticAPI {
	@Override
	public void eat() {
			System.out.println("Interface override: This bird loves eat worms!");
	};
	
	@Override
	public String toString() {
		return "Interface override: This is a bird derived from AnimalisticAPI";
	}

}
