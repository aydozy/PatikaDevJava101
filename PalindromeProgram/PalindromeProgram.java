package PalindromeProgram;

import java.util.Scanner;

/*Palindrom Say� Nedir ?
Palindromik say�, iki taraftan okundu�u zaman okunu� y�n�yle ayn� olan say�lard�r.

�rnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/

/*        Palindrome Algoritmas�
  1.Palindrome olup olmad���n� belirlenecek say�y� kullan�c�dan al�n.
  2.Say�y� ge�i�i bir de�i�kende tutun.
  3.Say�y� ters �evirin.
  4.Ters �evrilmi� say� ile ge�ici de�i�kende tutulmu� say�y� k�yaslay�n.
  5.Say�lar birbirine e�itse "palindrome say�d�r".
  6.De�ilse "palindrome say� de�ildir."  */

public class PalindromeProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// step 1
		System.out.print("Please enter a number: ");
		int num = sc.nextInt();

		// step 2
		int temp = num;
		int reversedNum = 0, remainder;

		// step 3: get the reverse of the num
		while (num != 0) {
			remainder = num % 10;
			reversedNum = (reversedNum * 10) + remainder;
			num = num / 10;

		}

		// step 4
		if (temp == reversedNum) {
			System.out.println("The number is palindrome number");
		} else {
			System.out.println("The number is not palindrome number");
		}

	}

}
