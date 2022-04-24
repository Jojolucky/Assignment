package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

public class ZooAbstractAnimals {
	
public List<AbstractAnimalAPI> abstractAnimals = new ArrayList<>();
	

public void add(AbstractAnimalAPI ai) {
	this.abstractAnimals.add(ai);
}

public void eat() {
	for (AbstractAnimalAPI obj : abstractAnimals) {
		obj.eat();;
	}
}

@Override
public String toString() {
	StringBuilder sb = new StringBuilder();
	System.out.println("\nZooAbstractAnimals @Override toString: \n");
	for (AbstractAnimalAPI obj : abstractAnimals) {
		sb.append(obj.toString()).append("\n");
	}
	return sb.toString();
}

public static void show() {
	
	ZooAbstractAnimals za = new ZooAbstractAnimals();
	System.out.println("\n********  Show Abstract ******** \n");
	AbstractBird aBird = new AbstractBird();
	AbstractCat aCat = new AbstractCat();
	AbstractDog aDog = new AbstractDog();

	za.add(aCat);
	za.add(aBird);
	za.add(aDog);
	System.out.println("@Override eat method \n");
	za.eat();
	System.out.println(za);
}

}
