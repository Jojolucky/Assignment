package edu.neu.csye6200;
public class ServiceFactory {



    private static  ServiceFactory serviceFactory = new ServiceFactory();

    private ServiceFactory(){}

    public static ServiceFactory getInstance(){
        return serviceFactory;
    }


    public Service createService(int id, double price, String name, String description, String starTime, String endTime, String timeUnits){
        return new Service(id,price,name,description,starTime,endTime,timeUnits);
    }


}
