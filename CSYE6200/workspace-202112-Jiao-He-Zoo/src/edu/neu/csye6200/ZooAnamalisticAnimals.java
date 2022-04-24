package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAnamalisticAnimals {
	
List<AnimalisticAPI> interfaceAnimals = new ArrayList<>();

public void add(AnimalisticAPI ai) {
	this.interfaceAnimals.add(ai);
}

public void eat() {
	for (AnimalisticAPI obj : interfaceAnimals) {
		obj.eat();;
	}
}

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	System.out.println("\nZooAnamalisticAnimals @Override toString: \n");
	for (AnimalisticAPI obj : interfaceAnimals) {
		sb.append(obj.toString()).append("\n");
	}
	return sb.toString();
}

public static void show() {
	
	ZooAnamalisticAnimals zi = new ZooAnamalisticAnimals();
	System.out.println("\n********  Show Interface ******** \n");
	InterfaceBird iBird = new InterfaceBird();
	InterfaceCat iCat = new InterfaceCat();
	InterfaceDog iDog = new InterfaceDog();

	zi.add(iCat);
	zi.add(iBird);
	zi.add(iDog);
	System.out.println("@Override eat method \n");
	zi.eat();
	System.out.println(zi);
	
}


}
