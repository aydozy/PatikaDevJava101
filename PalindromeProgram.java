package PalindromeProgram;

import java.util.Scanner;

/*Palindrom Sayı Nedir ?
Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.

Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....*/

/*        Palindrome Algoritması
  1.Palindrome olup olmadığını belirlenecek sayıyı kullanıcıdan alın.
  2.Sayıyı geçiçi bir değişkende tutun.
  3.Sayıyı ters çevirin.
  4.Ters çevrilmiş sayı ile geçici değişkende tutulmuş sayıyı kıyaslayın.
  5.Sayılar birbirine eşitse "palindrome sayıdır".
  6.Değilse "palindrome sayı değildir."  */

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
