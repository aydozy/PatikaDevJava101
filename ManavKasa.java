package ManavKasaProgramý;

import java.util.Scanner;

public class ManavKasa {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double muz = 0.95;
		double patlican = 5.00;

		System.out.println("Meyve ve sebzelerin kg fiyatlari : \n" + "1.Armut: " + armut + "\n" + "2.Elma: " + elma
				+ "\n" + "3.Domates: " + domates + "\n" + "4.Muz: " + muz + "\n" + "5.Patlican " + patlican);

		System.out.print("Armut kac kilo ? ");
		double armutKilo = sc.nextDouble();
		System.out.print("Elma kac kilo ? ");
		double elmaKilo = sc.nextDouble();
		System.out.print("Domates kac kilo ? ");
		double domatesKilo = sc.nextDouble();
		System.out.print("Muz kac kilo ? ");
		double muzKilo = sc.nextDouble();
		System.out.print("Patlican kac kilo ? ");
		double patlicanKilo = sc.nextDouble();

		double toplamTutar = (armut * armutKilo) + (elma * elmaKilo) + (domates * domatesKilo) + (muz * muzKilo)
				+ (patlican * patlicanKilo);

		System.out.println("Toplam Tutar : " + toplamTutar);
	}

}
