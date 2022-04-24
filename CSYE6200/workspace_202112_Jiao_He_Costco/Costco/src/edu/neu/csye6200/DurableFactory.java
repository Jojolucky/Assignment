package edu.neu.csye6200;
public class DurableFactory {


    private static  DurableFactory durableFactory;
    private DurableFactory(){};

    public synchronized  static DurableFactory getInstance(){
        if(durableFactory == null){
            durableFactory = new DurableFactory();
        }
        return  durableFactory;
    }

    public Durable createDurable(int id, double price, String name, String description, double weight, String weightUnits){
        return  new Durable(id,price,name,description,weight,weightUnits);

    }

}
