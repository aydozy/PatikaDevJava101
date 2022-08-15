package NotOrtalamas�Hesaplama;

import java.util.Scanner;

/*Not Ortalamas� Hesaplayan Program
Java ile Matematik, Fizik, Kimya, T�rk�e, Tarih, M�zik derslerinin s�nav puanlar�n� kullan�c�dan alan ve ortalamalar�n� hesaplay�p ekrana bast�r�lan program� yaz�n.

�dev
Ayn� program i�erisinde ko�ullu ifadeler kullan�larak, e�er kullan�c�n�n ortalamas� 60'dan b�y�k ise ekrana "S�n�f� Ge�ti" , k���k ise "S�n�fta Kald�" yazs�n.

Not : If ve Else kullan�lmayacak...*/

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
		System.out.print("T�rk�e notunuz: ");
		turkce = sc.nextInt();
		System.out.print("Tarih notunuz: ");
		tarih = sc.nextInt();
		System.out.print("M�zik notunuz: ");
		muzik = sc.nextInt();

		double ort;
		System.out.println("Ortalaman�z: " + (ort = (mat + fizik + kimya + turkce + tarih + muzik) / 6));
		
		boolean gectiMi = ort > 60;
		System.out.println(gectiMi ? "S�n�f� Ge�ti" : "S�n�fta Kald�");
		

	}

}
