package AdvanceCalculator;

import java.util.Scanner;

/*Ödev
Ayni projeye mod almak ve dikdörtgen alan çevre hesabini yapan metotlari yazip menüde islevsel hale getiriniz.*/

public class AdvanceCalculator {

	static void plus() {
		Scanner scan = new Scanner(System.in);
		int number, result = 0, i = 1;
		while (true) {
			System.out.print(i++ + ". sayý :");
			number = scan.nextInt();
			if (number == 0) {
				break;
			}
			result += number;
		}
		System.out.println("Sonuç : " + result);
	}

	static void minus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayı gireceksiniz :");
		int counter = scan.nextInt();
		int number, result = 0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayý :");
			number = scan.nextInt();
			if (i == 1) {
				result += number;
				continue;
			}
			result -= number;
		}

		System.out.println("Sonuç : " + result);
	}

	static void times() {
		Scanner scan = new Scanner(System.in);
		int number, result = 1, i = 1;

		while (true) {
			System.out.print(i++ + ". sayi :");
			number = scan.nextInt();

			if (number == 1)
				break;

			if (number == 0) {
				result = 0;
				break;
			}
			result *= number;
		}

		System.out.println("Sonuç : " + result);
	}

	static void divided() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Kaç adet sayi gireceksiniz :");
		int counter = scan.nextInt();
		double number, result = 0.0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". sayý :");
			number = scan.nextDouble();
			if (i != 1 && number == 0) {
				System.out.println("Böleni 0 giremezsiniz.");
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result /= number;
		}

		System.out.println("Sonuç : " + result);
	}

	static void power() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban değeri giriniz :");
		int base = scan.nextInt();
		System.out.print("Üs deðeri giriniz :");
		int exponent = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}

		System.out.println("Sonuç : " + result);
	}

	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayı giriniz :");
		int n = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println("Sonuç : " + result);
	}
	
	static void mode() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Birinci sayıyı giriniz : ");
		int num1 = sc.nextInt();
		System.out.println("Ýkinci sayıyı giriniz : ");
		int num2 = sc.nextInt();
		int result = num1 % num2;
		System.out.println("Sonuç: " + result);
		
	}
	
	static void rectangular() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Kýsa kenarý giriniz: ");
		int kýsaKenar = sc.nextInt();
		System.out.println("Uzun kenarý giriniz: ");
		int uzunKenar = sc.nextInt();
		int cevre = (kýsaKenar * 2) + (uzunKenar * 2);
		int alan = kýsaKenar * uzunKenar;
		System.out.println("Dikdörtgenin çevresi: " + cevre);
		System.out.println("Dikdötgenin alani: " + alan);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1- Toplama islemi\n" + "2- Çikarma islemi\n" + "3- Çarpma islemi\n" + "4- Bölme islemi\n"
				+ "5- Üslü Sayi Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikdörtgen Alan ve Çevre Hesabi\n" + "0- Cikis Yap";

		do {
			System.out.println(menu);
			System.out.print("Lütfen bir iþlem seçiniz :");
			select = scan.nextInt();
			switch (select) {
			case 1:
				plus();
				break;
			case 2:
				minus();
				break;
			case 3:
				times();
				break;
			case 4:
				divided();
				break;
			case 5:
				power();
				break;
			case 6:
				factorial();
				break;
			case 7:
				mode();
				break;
			case 8:
				rectangular();
				break;
			case 0:
				break;
			default:
				System.out.println("Yanlis bir deðer girdiniz, tekrar deneyiniz.");
			}
		} while (select != 0);

	}
}
