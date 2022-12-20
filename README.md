# PrimeNumber Unit Testing

A Java test case for prime numbers.

## Description

This program allows a user to check whether a number is a prime number or a composite number as well as performs a unit test on the program using the JUnit framework.

The ``PrimeNumberMethodTest`` class performs a test case to verify that the ``PrimeNumberMethod`` class under test meets it's specifications through the use of true and false assertion statements.

**The** ``PrimeNumberMethodTest`` **class:**

The ``testIsPrime()`` testing method provides the following assertions:
* ``assertFalse`` if the number is equals to 1, a composite number.
* ``assertTrue`` if the number is equals to 2, a prime number.
* ``assertFalse`` or ``assertEquals`` as false if the number is a composite number.
* ``assertTrue`` or ``assertEquals`` as true if the number is a prime number.

*(Three methods are offered for testing. See comments in java file for further notes on the different methods presented.)*

**The** ``PrimeNumberMethod`` **class:**

The ``PrimeNumberMethod`` class prompts the user to input a number. The ``isPrime()`` method then checks if the number is a prime number and prints out the returned result.

## Programming principles

This program employs the programming principles of software unit testing and JUnit assertions, conditional logic, and comparison operators.

## Dependencies

For the ``PrimeNumberMethod.java``:

* import java.util.Scanner;

For the ``PrimeNumberMethodTest.java``:

* import static org.junit.Assert.*;
* import org.junit.jupiter.api.Test;
* import java.util.Random;

## Running the program

Run the java files in any Java IDE, such as Eclipse. The ``PrimeNumberMethodTest.java`` file must be run as a *JUnit Test*. 

## Testing code preview

```java
@Test
public void testIsPrime() {
	
	// Assert as False if number is equal to 1.
	assertFalse("1 is not a prime number", PrimeNumberMethod.isPrime(1));
	
	// Assert as True if number is equal to 2.
	assertTrue("2 is a prime number", PrimeNumberMethod.isPrime(2));
	
	// ----- Method 1 ----- //
	
	// Assert as False if number is not a prime number. (3 test variations)
	assertFalse("4 is not a prime number", PrimeNumberMethod.isPrime(4));
	assertEquals(false,PrimeNumberMethod.isPrime(4));
	assertNotEquals(true,PrimeNumberMethod.isPrime(4));
	
	// Assert as True if number is a prime number. (3 test variations)
	assertTrue("19 is a prime number", PrimeNumberMethod.isPrime(19));
	assertEquals(true,PrimeNumberMethod.isPrime(19));
	assertNotEquals(false,PrimeNumberMethod.isPrime(19));
}
```

## Program code preview

```java
public static boolean isPrime (int number) {
				
	// Return false if the number is equal to a negative integer or 1.
	if (number <= 1) {
		return false;
	}
	// Return true if the number is equal to 2.
	if (number == 2) {
		return true;
	}
	
	// Check from 2 to number-1 if number is divisible without remainding value.
	for (int i = 2; i < number; i++) {
		if (number % i == 0) {
			return false;
		}
	}
	return true;
}
```

## Output preview

```text
Enter a number to check whether it is a prime number: 5

Yes! 5 is a prime number.
```

## Bonus app

This repo also contains a ``stringmethods`` folder with a java file that illustrates string testing methods using JUnit assertions.

&nbsp;
***
_Some numbers, even large ones, have no factors - except themselves, of course, and 1. These are called prime numbers, because everything they are starts with themselves. They are original, gnarled, unpredictable, the freaks of the number world._ ~ Richard Friedberg
***
&nbsp;

## License

This project is licensed under the GNU GENERAL PUBLIC LICENSE.

## Author

**Megan Bisschoff** 2022

Project submitted for Software Engineering bootcamp Level 3 Task 13 at [HyperionDev](https://www.hyperiondev.com/)

[View](https://www.hyperiondev.com/portfolio/86596/) submission results.  
