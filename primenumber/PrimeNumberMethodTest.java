// --- Testing Methods Options ---//
/* Method 1 hard codes a single sample odd and even number.
 * Method 2 has a sample list of all odd and even numbers ranging from 1 - 100 for testing.
 * Method 3 generates a random interger for testing. The method, however, has a logic error 
 * and the test fails with some numbers. Uncomment to view.
 */

package primenumber;

import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;
import java.util.Random;

class PrimeNumberMethodTest {

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
		
		// ----- Method 2 ----- //
		
		// Initialise sample list of Prime numbers 1 - 100 to test.
		int[] primeNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 
			53, 59, 61, 67, 71, 73, 79, 83, 89, 97};

		// Loop through each number and assert statement.
		for (int number : primeNumbers) {
			assertTrue((number + "is a prime number."), PrimeNumberMethod.isPrime(number));
		}
		
		// Initialise sample list of Composite numbers 1 - 100 to test.
		int[] compositeNumbers = {4, 6, 8, 9, 10, 12, 14, 15, 16, 18, 20, 21, 22, 24, 
			25, 26, 27, 28, 30, 32, 33, 34, 35, 36, 38, 39, 40, 42, 44, 45, 46, 48, 
			49, 50, 51, 52, 54, 55, 56, 57, 58, 60, 62, 63, 64, 65, 66, 68, 69, 70, 
			72, 74, 75, 76, 77, 78, 80, 81, 82, 84, 85, 86, 87, 88, 90, 91, 92, 93,
			94, 95, 96, 98, 99, 100};

		// Loop through each number and assert statement.
		for (int number : compositeNumbers) {
			assertFalse((number + " is not a prime number"), PrimeNumberMethod.isPrime(number));
		}
		
		// ----- Method 3 ----- //
		
		// Initialise Random object and generate a number between 3 - 100 to test.
//		Random random = new Random();
//		int randomNum = random.nextInt(48) *2 + 3;		
//		System.out.println("Number tested:\t" + randomNum);
		
		// Check if random number is a prime or not and assert statement.
//		for (int i = 2; i < randomNum/2; i++) {
//			if (randomNum % i == 0) {		
//				assertFalse(("Number: " + randomNum), PrimeNumberMethod.isPrime(randomNum));
//				System.out.println("Asserted False:\t" + randomNum + " is not a prime number.");
//				break;
//			} else if (randomNum % i != 0) {
//				assertTrue(("Number: " + randomNum), PrimeNumberMethod.isPrime(randomNum));
//				System.out.println("Asserted True:\t" + randomNum + " is a prime number.");
//				break;
//			}
//		}
		
	}

}