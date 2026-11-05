package com.mac190.vehicle;

/*
Design an abstract class Vehicle that has the following:
VIN number,
make (the brand)
fuelType
setters/getters

Methods, you want any derived class to implement the following methods
void turnRight(double degrees);
void turnLeft(double degrees);
void brake(); //puts the car into a stop mode.
boolean speedUp(double speed);
boolean moveBackwards();
boolean moveForward();
*/
abstract class Vehicle {
    String vinNumber;
    String make;
    String fuelType;

    // these need to be abstract.
    abstract void turnRight(double degrees);
    abstract void turnLeft(double degrees);
    abstract void brake();
    abstract boolean speedUp(double speed);
    abstract boolean moveBackwards();
    abstract boolean moveForward();

    // Getters/Setters
    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }
}
