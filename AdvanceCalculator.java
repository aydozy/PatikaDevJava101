package AdvanceCalculator;

import java.util.Scanner;

/*�dev
Ayn� projeye mod almak ve dikd�rtgen alan �evre hesab�n� yapan metotlar� yaz�p men�de i�levsel hale getiriniz.*/

public class AdvanceCalculator {

	static void plus() {
		Scanner scan = new Scanner(System.in);
		int number, result = 0, i = 1;
		while (true) {
			System.out.print(i++ + ". say� :");
			number = scan.nextInt();
			if (number == 0) {
				break;
			}
			result += number;
		}
		System.out.println("Sonu� : " + result);
	}

	static void minus() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ka� adet say� gireceksiniz :");
		int counter = scan.nextInt();
		int number, result = 0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". say� :");
			number = scan.nextInt();
			if (i == 1) {
				result += number;
				continue;
			}
			result -= number;
		}

		System.out.println("Sonu� : " + result);
	}

	static void times() {
		Scanner scan = new Scanner(System.in);
		int number, result = 1, i = 1;

		while (true) {
			System.out.print(i++ + ". say� :");
			number = scan.nextInt();

			if (number == 1)
				break;

			if (number == 0) {
				result = 0;
				break;
			}
			result *= number;
		}

		System.out.println("Sonu� : " + result);
	}

	static void divided() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Ka� adet say� gireceksiniz :");
		int counter = scan.nextInt();
		double number, result = 0.0;

		for (int i = 1; i <= counter; i++) {
			System.out.print(i + ". say� :");
			number = scan.nextDouble();
			if (i != 1 && number == 0) {
				System.out.println("B�leni 0 giremezsiniz.");
				continue;
			}
			if (i == 1) {
				result = number;
				continue;
			}
			result /= number;
		}

		System.out.println("Sonu� : " + result);
	}

	static void power() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban de�eri giriniz :");
		int base = scan.nextInt();
		System.out.print("�s de�eri giriniz :");
		int exponent = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= exponent; i++) {
			result *= base;
		}

		System.out.println("Sonu� : " + result);
	}

	static void factorial() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Say� giriniz :");
		int n = scan.nextInt();
		int result = 1;

		for (int i = 1; i <= n; i++) {
			result *= i;
		}

		System.out.println("Sonu� : " + result);
	}
	
	static void mode() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Birinci say�y� giriniz : ");
		int num1 = sc.nextInt();
		System.out.println("�kinci say�y� giriniz : ");
		int num2 = sc.nextInt();
		int result = num1 % num2;
		System.out.println("Sonu�: " + result);
		
	}
	
	static void rectangular() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("K�sa kenar� giriniz: ");
		int k�saKenar = sc.nextInt();
		System.out.println("Uzun kenar� giriniz: ");
		int uzunKenar = sc.nextInt();
		int cevre = (k�saKenar * 2) + (uzunKenar * 2);
		int alan = k�saKenar * uzunKenar;
		System.out.println("Dikd�rtgenin �evresi: " + cevre);
		System.out.println("Dikd�tgenin alan�: " + alan);
		
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int select;
		String menu = "1- Toplama ��lemi\n" + "2- ��karma ��lemi\n" + "3- �arpma ��lemi\n" + "4- B�lme i�lemi\n"
				+ "5- �sl� Say� Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
				+ "8- Dikd�rtgen Alan ve �evre Hesab�\n" + "0- ��k�� Yap";

		do {
			System.out.println(menu);
			System.out.print("L�tfen bir i�lem se�iniz :");
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
				System.out.println("Yanl�� bir de�er girdiniz, tekrar deneyiniz.");
			}
		} while (select != 0);

	}
}
