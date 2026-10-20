package com.mac190.prime;
/*
design, implement and test a class Prime that has the following properties:
- an integer member variable prime that is prime at all times.
- default constructor that sets prime to 2
- Constructor that accepts an integer and sets prime to the closest prime number larger
or equal to the input (use the setter).
-getter
- setter that sets prime to the closest prime larger or equal to input.
example try to set prime to 8, prime will be set to 11.
- toString
- equals.
- method public Prime add(Prime p) returns a Prime that is a sum of this and p
- method puvlic Prime add(int a) returns a Prime that is a sum of this a
- In a separete tester test your class.

private boolean isPrime(int a){
   //if a is smaller than 2 return false
   //if a is 2 return true.
   //if a is a multiple of 2 return false
   //for int i start at 3 to squareRoot of a included
        //if a isi divisible by i then return false
   //if the loop ends without a return then a is prime.
}
 */
public class Prime {
    private int prime;

    public Prime(){
        prime = 2;
    }
    public Prime(int a){
        this.setPrime(a);
    }

    //getters
    public int getPrime(){
        return prime;
    }
    public static boolean isPrime(int a){
        //In static methods there is no "this" as they are
        //invoked on the class not on an object.
        if(a == 2){
            return true;
        }
        if(a < 2){
            return false;
        }
        if(a%2 == 0){
            return false;
        }
        for(int i = 3; i <= Math.sqrt(a); i += 2){
            if(a%i == 0){
                return false;
            }
        }
        return true;
    }
    //setter
    public void setPrime(int a){
        while(!isPrime(a)){
            a++;
        }
        //a is prime now
        prime = a;
    }
    public String toString(){
        return "" + prime;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !obj.getClass().equals(this.getClass())) {
            return false;
        }
        Prime p = (Prime) obj;
        return (p.prime == this.prime);
    }
    public Prime add(Prime p){
        //how many objects should there be?
        //There will be three: p, this and the returned
        //object
        return new Prime(p.prime + this.prime);
    }
    //any method can be implemented as a static method.
    //In a member method there is this object that is implicit
    //all you need to make it explicit in a static method
    public static Prime add(Prime p, Prime t){
        return new Prime(p.prime + t.prime);
    }

    public Prime add(int a){
        //how many objects will there be?
        //Two objects: this and the returned Prime object
        return new Prime(this.prime + a);

    }
    //implement the method above as a static method. test it.
    public static Prime add(Prime t, int a){
        //how many objects will there be?
        //Two objects: this and the returned Prime object
        return new Prime(t.prime + a);

    }

}
