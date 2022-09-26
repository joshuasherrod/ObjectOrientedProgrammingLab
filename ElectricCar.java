package edu.sdccd.cisc191;

public class ElectricCar extends Car implements Chargeable {

    int batteryCharge;

    public ElectricCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] details, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, details, numberOfDoors);
    }

    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public void chargeUp() {
        batteryCharge = 100;
    }

}
