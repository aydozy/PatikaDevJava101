package BodyMassIndex;

import java.util.Scanner;

public class BodyMassIndex {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Lütfen boyunuzu (metre cinsinde) giriniz : ");
		double boy = sc.nextDouble();
		System.out.print("Lütfen kilonuzu giriniz : ");
		double kilo = sc.nextDouble();

		double index = kilo / (boy*boy);
		System.out.print("Vücut kitle indeksiniz : " + index);

	}

}
