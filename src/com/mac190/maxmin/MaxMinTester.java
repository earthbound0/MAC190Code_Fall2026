package com.mac190.maxmin;

public class MaxMinTester {
    public static void main(String[] args) {
        //create a default MaxMin
        MaxMin M1 = new MaxMin();
        System.out.println("M1: " + M1);
        M1.setMaxMin(5, 2);
        System.out.println("M1: " + M1);
        M1.setMin(9);
        System.out.println("M1: " + M1);//(5, 9)
        M1.setMax(1);
        System.out.println("M1: " + M1);
        MaxMin M2 = new MaxMin(3, 7);
        System.out.println("M2: " + M2);
        MaxMin M3 = M1.add(M2);
        System.out.println("M3: " + M3);
        //in one single instruction.
        //Perform M3 = M3*(-2) + 2*(M1 + M2)
        M3 = M3.multiply(-2).add(M1.add(M2).multiply(2));
        System.out.println("M3: " + M3);

    }
}
