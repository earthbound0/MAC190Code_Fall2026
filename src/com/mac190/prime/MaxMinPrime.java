package com.mac190.prime;
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

}
