package com.mac190.prime;

import com.mac190.maxmin.MaxMin;

/*
Implement the same class MaxMin we did before with the member
variables max and min being Prime objects NOT integers.
-default constructor that creates default Prime objects for
both max and min
- Constructor that accepts an integer and creates Prime objects
witht hesame integer for both max and min
- Constructor that accepts two integers and small goes to min and larger
gors to max
- Constructor accepting a Prime object and creates two Prime objects
copies for max and min.
- Constructor accepting two Prime objects, smallest for min and largest
for max.
- getter getMinPrime() return min as a Prime object
- getter getMin() returns min as integer
- same for max
- setter setMin(Prime p) sets min to min of p
- setter setMin(int a) sets prime of min to a
- same for setters for max
- toString() returns (min, max)
- equals compares two MaxMinPrime objects
- public MaxMinPrime add(MaxMinPrime p) retrurns a MaxMinPrime
as the sum of the two MaxMinPrime objects.
- public MaxMinPrime add(MaxMin m) returns a MaxMinPrime object
where min of m is added to min of MaxMinPrime etc...
- public MaxMinPrime add(int a) where a is added to both min and max
- implement all methods above as static methods.
- Test your class extensively.
 */
public class MaxMinPrime {
    private Prime max, min;
    public MaxMinPrime(){
        min = new Prime();
        max = new Prime();
    }
    public MaxMinPrime(int a){
        min = new Prime(a);
        max = new Prime(a);
    }
    public MaxMinPrime(Prime p){
        /*
        min = p;
        max = p;
        Never do this, because min and max will refer to the same
        object, you have the same object!.
         */
        min = new Prime(p.getPrime());
        max = new Prime(p.getPrime());
    }
    public MaxMinPrime(int a, int b){
        min = new Prime(a);
        max = new Prime(b);
        if(a > b){
            Prime temp = min;
            min = max;
            max = temp;
        }
    }
    public MaxMinPrime(Prime a, Prime b){
        min = new Prime(a.getPrime());
        max = new Prime(b.getPrime());
        if(a.getPrime() > b.getPrime()){
            //swap min and max
            Prime temp = min;
            min = max;
            max = temp;
        }
    }
    public MaxMinPrime(MaxMin m){
        min = new Prime(m.getMin());
        max = new Prime(m.getMax());
    }

    public String toString(){
        return "(" + this.min.getPrime() + ", " + this.max.getPrime() + ")";
    }

}
