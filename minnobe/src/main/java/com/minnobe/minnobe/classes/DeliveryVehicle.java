package com.minnobe.minnobe.classes;

public class DeliveryVehicle {

    String year;
    String make;
    String model;
    String color;
    String driverId;
    public String getYear() {
        return year;
    }
    public void setYear(String year) {
        this.year = year;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getDriverId() {
        return driverId;
    }
    public void setDriverId(String driverId) {
        this.driverId = driverId;
    }

    public DeliveryVehicle(String year, String make, String model, String color, String driverId) {
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.driverId = driverId;
    }
    
    
    
}
