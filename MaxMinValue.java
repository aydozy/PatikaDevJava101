package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxMinValue {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] list = { 56, 34, 1, 8, 101, -2, -33 };
		// order of the list
		Arrays.sort(list);
		// print the list
		System.out.println(Arrays.toString(list));

		// select a number
		System.out.print("Select a number: ");
		int num = sc.nextInt();

		int min = list[0];
		int max = list[0];

		for (int i : list) {
			if (i < num) {
				min = i;
			}
			if (i > num) {
				max = i;
			}
		}

		System.out.println("The nearest number smaller than the entered number : " + min);
		System.out.println("The nearest number bigger than the entered number : " + max);

	}

}
