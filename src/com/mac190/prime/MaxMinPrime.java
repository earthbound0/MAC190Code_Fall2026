package com.mac190.prime;

import com.mac190.maxmin.MaxMin;

import java.util.Objects;

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
- implement all add methods above as static methods.
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
    //Often we want to make a copy of an existing object.
    //assignment does not achieve that
    //for that we create a copy constructor that accepts
    //an object of the same class and creates a copy of it
    public MaxMinPrime(MaxMinPrime mp){
        min = new Prime(mp.min.getPrime());
        max = new Prime(mp.max.getPrime());
    }

    //getters
    public int getMin(){
        return min.getPrime();
    }
    public int getMax(){
        return max.getPrime();
    }
    public Prime getMinPrime(){
        return min;
    }
    public Prime getMaxPrime(){
        return max;
    }
    //setters
    public void setMin(int a){
        if(a > max.getPrime()){
            min.setPrime(max.getPrime());
            max.setPrime(a);
        }else{
            min.setPrime(a);
        }
    }
    public void setMax(int a){
        if(a < min.getPrime()){
            max.setPrime(min.getPrime());
            min.setPrime(a);
        }else{
            max.setPrime(a);
        }
    }
    //setters
    public void setMin(Prime a){
        if(a.getPrime() > max.getPrime()){
            min.setPrime(max.getPrime());
            max.setPrime(a.getPrime());
        }else{
            min.setPrime(a.getPrime());
        }
    }
    public void setMax(Prime a){
        if(a.getPrime() < min.getPrime()){
            max.setPrime(min.getPrime());
            min.setPrime(a.getPrime());
        }else{
            max.setPrime(a.getPrime());
        }
    }
    public void setMaxMin(int a, int b){
        if(a < b){
            min.setPrime(a);
            max.setPrime(b);
        }else{
            min.setPrime(b);
            max.setPrime(a);
        }
    }
    public void setMaxMin(Prime a, Prime b){
        if(a.getPrime() < b.getPrime()){
            min.setPrime(a.getPrime());
            max.setPrime(b.getPrime());
        }else{
            min.setPrime(b.getPrime());
            max.setPrime(a.getPrime());
        }
    }
    public String toString(){
        return "(" + this.min.getPrime() + ", " + this.max.getPrime() + ")";
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        MaxMinPrime that = (MaxMinPrime) o;
        return Objects.equals(max, that.max) && Objects.equals(min, that.min);
    }

    public MaxMinPrime add(MaxMinPrime p) {
        return new MaxMinPrime(this.getMin() + p.getMin(), this.getMax() + p.getMax());
    }
    //same method as static
    public static MaxMinPrime add(MaxMinPrime t, MaxMinPrime p) {
        return new MaxMinPrime(t.getMin() + p.getMin(), t.getMax() + p.getMax());
    }
    public MaxMinPrime add(MaxMin m){
        return new MaxMinPrime(this.getMin() + m.getMin(), this.getMax() + m.getMax());
    }
    //same method as static
    public static MaxMinPrime add(MaxMinPrime t, MaxMin m){
        return new MaxMinPrime(t.getMin() + m.getMin(), t.getMax() + m.getMax());
    }
    public MaxMinPrime add(int a){
        return new MaxMinPrime(this.getMin() + a, this.getMax() + a);
    }
    //same method static
    public static MaxMinPrime add(MaxMinPrime t, int a){
        return new MaxMinPrime(t.getMin() + a, t.getMax() + a);
    }
}
