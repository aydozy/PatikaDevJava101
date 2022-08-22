package FibonacciRecursive;

import java.util.Scanner;

/*The fibonacci series is a series in which each number is the sum of the previous two numbers*/

public class FibonacciRecursive {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Select a number: ");
		int num = sc.nextInt();

		System.out.println("The " + num + "th fibonacci number is: " + fibonacci(num));

	}

	public static int fibonacci(int num) {
		if ((num == 0) || (num == 1)) {
			return num;
		} else {
			return fibonacci(num - 1) + fibonacci(num - 2);
		}
	}

}
