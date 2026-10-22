package com.mac190.midtermreview;

public class MidtermTester {
    public static void main(String[] args) {
        //create a default rectangle
        Rectangle R1 = new Rectangle();
        System.out.println("R1: " + R1);

        R1.setLength(23);
        R1.setWidth(4);
        System.out.println("R1: " + R1 + " Perim: " + R1.perim() + " area: " + R1.area());
        //make a copy of R1
        Rectangle R2 = new Rectangle(R1);
        System.out.println("R2: " + R2);
        //create R3 as the sum of R1 and R2
        Rectangle R3 = R1.add(R2);
        System.out.println("R3: " + R3);
        //using the static add method
        R1 = Rectangle.add(R1, R2);
        System.out.println("R1: " + R1 + " Perim: " + R1.perim() + " area: " + R1.area());

    }
}
