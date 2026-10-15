package com.mac190.maxmin;
/*
Design and implement a class MaxMin that has the following properties:
- two integer member variables max and min where max has to be always larger or equal
than min.
- Default constructor set both min and max to 0
- Constructor that accepts one value set both min and max to that value
- constructor that accepts two values, set min to the smallest and max to the largest
- getters for max and min
- setter for min that works as follows: if you try to set min to a larger value than
max, then min is set to the old value of max and max is set to the input value. Otherwise
min is set to the input value
- setter for max that works as follows: if you try to set max to a smaller value than
min, then max is set to the old value of min and min is set to the input value. Otherwise
max is set to the input value
- setter for both setMinMax(int a, int b) set min to the smallest and max to the largest
-toString method that returns min max as a couple (min, max)
- Override the equals methods to return true if both min and max values are same.
- method MaxMin add(MaxMin m) returns a MaxMin Object where min is the sum of mins and
max is the sum of maxs.
- method MaxMin add(int a) returns a MaxMin object similar to this whene both min and max
are added a.
- method MaxMin multiply(int a) returns a MaxMin object where min and max are multiplied
by a (if a is negative then max and min invert).
- Later: static methods. Implement all add methods and multiply as static methods.
- In a separate Tester class, test your class extensively.

 */
public class MaxMin {
}
