package edu.neu.csye6200;
public class Service extends ItemAPI{

    private String starTime;
    private String endTime;
    private String timeUnits;


    public Service(int id, double price, String name, String description, String starTime, String endTime, String timeUnit) {
        super(id, price, name, description);
        this.starTime = starTime;
        this.endTime = endTime;
        this.timeUnits = timeUnit;
    }
    
    public Service() {}

    public String getStarTime() {
        return starTime;
    }

    public void setStarTime(String starTime) {
        this.starTime = starTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public String getTimeUnit() {
        return timeUnits;
    }

    public void setTimeUnit(String timeUnits) {
        this.timeUnits = timeUnits;
    }
}
