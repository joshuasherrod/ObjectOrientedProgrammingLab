package edu.sdccd.cisc191;

public class PickupTruck extends Vehicle {

    int cargoCapacity;

    public PickupTruck(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] details, int cargoCapacity) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, details);
        this.cargoCapacity = cargoCapacity;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

}
