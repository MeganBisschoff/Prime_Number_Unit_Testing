package primenumber;

import java.util.Scanner;

public class PrimeNumberMethod {

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
	
	public static void main(String[] args) {
		
		// Open scanner object.
		Scanner input = new Scanner(System.in);

		// Prompt user to input number and initialise variable.
		System.out.println("Enter a number to check whether it is a prime number: ");
		int number = input.nextInt();
		
		// Call method to check if it's a prime number and print out the returned result.
		if (isPrime(number)) {
			System.out.println("\nYes! " + number + " is a prime number.\n");
		} 
		else {
			System.out.println("\nSorry! " + number + " is not a prime number.\n");
		}
		input.close();
	}
}

