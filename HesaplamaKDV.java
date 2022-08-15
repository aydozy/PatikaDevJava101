package HesaplamaKDV;

import java.util.Scanner;

/*Java ile kullanıcıdan alınan para değerinin KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.

(Not : KDV tutarını 18% olarak alın)

KDV'siz Fiyat = 10;

KDV'li Fiyat = 11.8;

KDV tutarı = 1.8;

Ödev
Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.*/

public class HesaplamaKDV {

	public static void main(String[] args) {

		double tutar, yeniTutar = 0, kdvOran = 0.18;

		Scanner sc = new Scanner(System.in);

		System.out.print("KDV'siz fiyatı giriniz: ");
		tutar = sc.nextDouble();

		yeniTutar = ((tutar * kdvOran) + tutar);
		System.out.println("KDV'li fiyat: " + yeniTutar);

		System.out.println("KDV oranı: " + (yeniTutar - tutar));

		
		// ödev kısmı
		
		if (tutar >= 0  && tutar <= 1000) {
			System.out.println("KDV oranı %18'e göre: " + (yeniTutar - tutar));
		} else {
			double yeniKdvOran = 0.08;
			yeniTutar = ((tutar * yeniKdvOran) + tutar);
			System.out.println("KDV oranı %8'e göre: " + (yeniTutar - tutar));
		}
	}

}
