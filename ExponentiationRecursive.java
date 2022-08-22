package Exponentiation;

import java.util.Scanner;

public class ExponentiationRecursive {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base value: ");
		int base = sc.nextInt();
		System.out.print("Enter exponent: ");
		int exponent = sc.nextInt();
		System.out.print("Result " + exponential(base, exponent));
		
		

	}
	
	public static int exponential(int base, int exponent) 
	{
		if((base == 1) || (exponent == 0) ) 
		{
			return 1;
		}else 
		{
			return (base * exponential(base, exponent-1));
		}
	}

}
