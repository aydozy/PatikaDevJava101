package PrimeNumberRecursive;

import java.util.Scanner;
/*A number is prime, if it is divisible by 1 and number itself.*/

public class PrimeNumberRecursive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a number: ");
		int num = sc.nextInt();

		if (isPrime(num, 2) == 0) {
			System.out.println("It is prime.");
		} else {
			System.out.println("It is not prime.");
		}

	}

	public static int isPrime(int num, int i) {
		if (i == 2) {
			return 1;
		} else if (num % i == 0) {
			return 0;
		} /*else if (i * i > num) {
			return 1;
		}*/ else {
			return isPrime(num, i + 1);
		}

	}

}
