package HesaplamaKDV;

import java.util.Scanner;

/*Java ile kullan�c�dan al�nan para de�erinin KDV'li fiyat�n� ve KDV tutar�n� hesaplay�p ekrana bast�ran program� yaz�n.

(Not : KDV tutar�n� 18% olarak al�n)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutar� = 1.8;

�dev
E�er girilen tutar 0 ve 1000 TL aras�nda ise KDV oran� %18 , tutar 1000 TL'den b�y�k ise KDV oran�n� %8 olarak KDV tutar� hesaplayan program� yaz�n�z.*/

public class HesaplamaKDV {

	public static void main(String[] args) {

		double tutar, yeniTutar = 0, kdvOran = 0.18;

		Scanner sc = new Scanner(System.in);

		System.out.print("KDV'siz fiyat� giriniz: ");
		tutar = sc.nextDouble();

		yeniTutar = ((tutar * kdvOran) + tutar);
		System.out.println("KDV'li fiyat: " + yeniTutar);

		System.out.println("KDV oran�: " + (yeniTutar - tutar));

		
		// �dev k�sm�
		
		if (tutar >= 0  && tutar <= 1000) {
			System.out.println("KDV oran� %18'e g�re: " + (yeniTutar - tutar));
		} else {
			double yeniKdvOran = 0.08;
			yeniTutar = ((tutar * yeniKdvOran) + tutar);
			System.out.println("KDV oran� %8'e g�re: " + (yeniTutar - tutar));
		}
	}

}
