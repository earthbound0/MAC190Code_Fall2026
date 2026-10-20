package com.mac190.prime;

public class PrimeTester {
    public static void main(String[] args) {
        //create a default prime
        Prime P1 = new Prime();
        System.out.println("P1: " + P1);
        Prime P2= new Prime(14);
        System.out.println("P2: " + P2);
        //check if 2357 is prime
        //static methods are called/invoked on a class not on
        //an object.
        System.out.println("Is 2357 prime? " + Prime.isPrime(2357));
        //set P1 to 25
        P1.setPrime(25);
        System.out.println("P1: " + P1);
        //add P2 to P1
        P1.add(P2); //this will not change P1, the object returned is
        //gone!!!
        System.out.println("P1: " + P1);
        P1 = P1.add(P2); //this is the proper way to add P2 to P1
        System.out.println("P1: " + P1);
        //perform the following P2 = P2 + P1 + 20;
        P2 = P2.add(P1.add(20));
        System.out.println("P2: " + P2);
        //add P1 and P2 into P3 using the static method add
        Prime P3 = Prime.add(P1, P2);
        System.out.println("P3: " + P3);

    }
}
