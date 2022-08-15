package NotOrtalamasýHesaplama;

import java.util.Scanner;

/*Not Ortalamasý Hesaplayan Program
Java ile Matematik, Fizik, Kimya, Türkçe, Tarih, Müzik derslerinin sýnav puanlarýný kullanýcýdan alan ve ortalamalarýný hesaplayýp ekrana bastýrýlan programý yazýn.

Ödev
Ayný program içerisinde koþullu ifadeler kullanýlarak, eðer kullanýcýnýn ortalamasý 60'dan büyük ise ekrana "Sýnýfý Geçti" , küçük ise "Sýnýfta Kaldý" yazsýn.

Not : If ve Else kullanýlmayacak...*/

public class CalculateAverage {

	public static void main(String[] args) {

		int mat, fizik, kimya, turkce, tarih, muzik;

		Scanner sc = new Scanner(System.in);

		System.out.print("Matematik notunuz: ");
		mat = sc.nextInt();
		System.out.print("Fizik notunuz: ");
		fizik = sc.nextInt();
		System.out.print("Kimya notunuz: ");
		kimya = sc.nextInt();
		System.out.print("Türkçe notunuz: ");
		turkce = sc.nextInt();
		System.out.print("Tarih notunuz: ");
		tarih = sc.nextInt();
		System.out.print("Müzik notunuz: ");
		muzik = sc.nextInt();

		double ort;
		System.out.println("Ortalamanýz: " + (ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6));
		
		boolean gectiMi = ort > 60;
		System.out.println(gectiMi ? "Sýnýfý Geçti" : "Sýnýfta Kaldý");
		

	}

}
