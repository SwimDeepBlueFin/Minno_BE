package com.minnobe.minnobe.classes;

import jakarta.persistence.*;


@Entity
@Table(name = "deliveryVehicle")
public class DeliveryVehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    String carId;

    @Column(name = "year")
    String year;

    @Column(name = "make")
    String make;

    @Column(name = "model")
    String model;

    @Column(name = "color")
    String color;

    @Column(name = "driverId")
    String driverId;

    
    public DeliveryVehicle(String carId, String year, String make, String model, String color, String driverId) {
        this.carId = carId;
        this.year = year;
        this.make = make;
        this.model = model;
        this.color = color;
        this.driverId = driverId;
    }
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
    public String getCarId() {
        return carId;
    }
    public void setCarId(String carId) {
        this.carId = carId;
    }


    @Override
    public String toString() {
        return "DeliveryVehicle [carId=" + carId + ", year=" + year + ", make=" + make + ", model=" + model + ", color="
                + color + ", driverId=" + driverId + "]";
    }
    
}
