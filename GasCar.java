package edu.sdccd.cisc191;

public class GasCar extends Car implements Combustible{

    int fuelLevel;

    public GasCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] details, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, details, numberOfDoors);
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public void tankUp() {
        fuelLevel = 100;
    }
}
