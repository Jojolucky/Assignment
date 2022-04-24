package edu.neu.csye6200;
public class Durable extends ItemAPI {

    private double weight;
    private String weightUnits;


    public Durable(int id, double price, String name, String description, double weight, String weightUnit) {
        super(id, price, name, description);
        this.weight = weight;
        this.weightUnits = weightUnit;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getUnit() {
        return weightUnits;
    }

    public void setUnit(String weightUnits) {
        this.weightUnits = weightUnits;
    }
}
