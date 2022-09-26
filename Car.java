package edu.sdccd.cisc191;

public class Car extends Vehicle{

    private int numberOfDoors;

    public Car(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] details, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, details);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}
