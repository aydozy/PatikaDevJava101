import java.util.Scanner;

public class Hipoten�sHesaplama {
	/*
	 * Dik ��gende Hipoten�s Bulan Program Java ile kullan�c�dan dik kenarlar�n�n
	 * uzunlu�unu alan ve hipoten�s� hesaplayan program� yaz�n.
	 * 
	 * �dev:  �� kenar uzunlu�unu kullan�c�dan ald���n�z ��genin alan�n� hesaplayan
	 * program� yaz�n�z.
	 */

	public static void main(String[] args) {

		int birinciKenar, ikinciKenar, hipotenus;
		Scanner sc = new Scanner(System.in);
		System.out.print("��genin birinci kenarn� giriniz: ");
		birinciKenar = sc.nextInt();
		System.out.print("��genin ikinci kenar�n� giriniz: ");
		ikinciKenar = sc.nextInt();
		
		hipotenus =(int) ( Math.pow(birinciKenar,2) + Math.pow(ikinciKenar, 2));
		System.out.print("Hipotenus uzunlu�u: " + Math.sqrt(hipotenus));
	
		System.out.println();
		
		// dik ��gende alan bulma 
		double dik�cgenAlan = (birinciKenar * ikinciKenar) /2;
		System.out.print("Dik ��genin alan�: " + dik�cgenAlan);
		
		System.out.println();
		
		// ��gende alan bulma
		
		int ucuncuKenar;
		System.out.print("��genin ���nc� kenar�: ");
		ucuncuKenar = sc.nextInt();
		
		int cevreYar�s� = (birinciKenar + ikinciKenar + ucuncuKenar) / 2;
		int alan = cevreYar�s� * (cevreYar�s� - birinciKenar) * (cevreYar�s� - ikinciKenar) * (cevreYar�s� - ucuncuKenar);
		
		System.out.println("��genin alan�: " + Math.sqrt(alan));
	
	}
	

}
