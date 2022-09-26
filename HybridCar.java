package edu.sdccd.cisc191;

public class HybridCar extends Car implements Combustible, Chargeable{

    int fuelLevel;
    int batteryLevel;
    int batteryCharge;

    public HybridCar(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] details, int numberOfDoors) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, details, numberOfDoors);

    }


    public int getBatteryCharge() {
        return batteryCharge;
    }

    public void setBatteryCharge(int batteryCharge) {
        this.batteryCharge = batteryCharge;
    }

    public int getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelLevel = fuelLevel;
    }
    public void chargeUp() {
        batteryCharge = 100;
    }
    public void tankUp() {
        fuelLevel = 100;
    }
}
