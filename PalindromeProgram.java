package PalindromeProgram;

import java.util.Scanner;

/*Palindrom Sayi Nedir ?
Palindromik sayi, iki taraftan okundugu zaman okunus yönüyle ayni olan sayilardir.
Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/

/*        Palindrome Algoritmasi
  1.Palindrome olup oladigini belirlenecek sayiyi kullanicidan alin.
  2.Sayiyi geçiçi bir degiskende tutun.
  3.Sayiyi ters çevirin.
  4.Ters çevrilmis sayi ile geçici degiskende tutulmus sayiyi kiyaslayin.
  5.Sayilar birbirine esitese "palindrome sayidir".
  6.Degilse "palindrome sayi degildir."  */

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
