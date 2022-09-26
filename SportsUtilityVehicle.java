package edu.sdccd.cisc191;

public class SportsUtilityVehicle extends Vehicle {

    int maxTowingWeight;

    public SportsUtilityVehicle(String manufacturerName, int milesOnVehicle, int price, int numberOfSeats, Option[] details, int maxTowingWeight) {
        super(manufacturerName, milesOnVehicle, price, numberOfSeats, details);
        this.maxTowingWeight = maxTowingWeight;
    }

    public int getMaxTowingWeight() {
        return maxTowingWeight;
    }

    public void setMaxTowingWeight(int maxTowingWeight) {
        this.maxTowingWeight = maxTowingWeight;
    }

}
