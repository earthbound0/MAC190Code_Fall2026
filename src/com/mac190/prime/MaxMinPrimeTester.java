package com.mac190.prime;

import com.mac190.maxmin.MaxMin;

//Test MaxMinPrime class here
public class MaxMinPrimeTester {
    public static void main(String[] args) {
        //make Prime
        Prime P1 = new Prime(15);
        //make a MaxMin object
        MaxMin M1 = new MaxMin(5, 10);
        //make MaxMinPrime object from P1
        MaxMinPrime MP1 = new MaxMinPrime(P1);
        System.out.println("MP1: " + MP1);
        //make a MaxMinPrime object from M1
        MaxMinPrime MP2 = new MaxMinPrime(M1);
        System.out.println("MP2: " + MP2);

    }
}
