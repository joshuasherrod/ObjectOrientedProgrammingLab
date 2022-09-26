package edu.sdccd.cisc191;

public class Vehicle {
    private String manufacturerName;
    private int milesOnVehicle;
    private int price;
    private int numberOfSeats;
    private Option[] options;

    public Vehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] details) {
        this.manufacturerName = manufacturerName;
        this.milesOnVehicle = milesOnVehicle;
        this.price = price;
        this.numberOfSeats = numberOfSeats;
        this.options = details;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getMilesOnVehicle() {
        return milesOnVehicle;
    }

    public void setMilesOnVehicle(int milesOnVehicle) {
        this.milesOnVehicle = milesOnVehicle;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public Option[] getOptions() {
        return options;
    }

    public void setOptions(Option[] options) {
        this.options = options;
    }

}
