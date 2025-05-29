import java.util.Scanner;

public class PrimeNumberCheck {
	boolean isPrime(int num) {
		if (num <= 1) {
			return false; // 0 and 1 are not prime numbers
		}
		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false; // Found a divisor, not prime
			}
		}
		return true; // No divisors found, it's prime
	}

	 public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.print("Enter a Number: ");
		  int num = sc.nextInt();
		  System.out.println("You entered: " + Math.sqrt(num));
		  boolean result = new PrimeNumberCheck().isPrime(num);

		  if (result) {
			  System.out.println(num + " is a prime number.");
		  } else {
			  System.out.println(num + " is not a prime number.");
		  }
	  }
}
