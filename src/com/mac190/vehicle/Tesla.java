package com.mac190.vehicle;

/*
Design a class Tesla, that is a Vehicle, in addition it has the following:
FuelType is electric
Make is "Tesla"
Model of the car
It has a Color and number of seats as well.

Implement the methods as follows:
turnLeft, just display turning left the degree amount
same for turn right
Brake implement it so that the car is put in stop mode
moveForward implement it so that the car moves forward only if it was in
stopped state already
Same for moveBackwards
implement speedUp to increase the speed by no more than 10miles/hour
or the input (if the input is less than 10 m/h) and display the speed, limit the speed to 80miles/hour
speedUp only increases if it is movingForward.

Test your class.

*/
public class Tesla extends Vehicle{
    String model;
    String color;
    int numberOfSeats;

    Tesla(){fuelType = "Electric"; make = "Tesla"; model = "N/A"; color = "N/A"; numberOfSeats = 4;}
    Tesla(String v, String m, String c, int s){
        vinNumber = v;
    }

    @Override
    void turnRight(double degrees) {
        System.out.println("The Tesla did a " + degrees + " degree turn to the right.");
    }

    @Override
    void turnLeft(double degrees) {
        System.out.println("The Tesla did a " + degrees + " degree turn to the left.");
    }

    @Override
    void brake() {
        System.out.println("The Tesla has stopped.");
    }

    @Override
    boolean speedUp(double speed) {
        return false;
    }

    @Override
    boolean moveBackwards() {
        if (State.STOPPED){
            State.BACKWARDS;
        }
        else return false;
    }

    @Override
    boolean moveForward() {
        return false;
    }
}
