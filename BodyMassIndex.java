package BodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("L�tfen boyunuzu (metre cinsinde) giriniz : ");
		double boy = sc.nextDouble();
		System.out.print("L�tfen kilonuzu giriniz : ");
		double kilo = sc.nextDouble();

		double index = kilo / (boy*boy);
		System.out.print("V�cut kitle indeksiniz : " + index);

	}

}
