import java.util.Scanner;

public class HipotenüsHesaplama {
	/*
	 * Dik Üçgende Hipotenüs Bulan Program Java ile kullanýcýdan dik kenarlarýnýn
	 * uzunluðunu alan ve hipotenüsü hesaplayan programý yazýn.
	 * 
	 * Ödev:  Üç kenar uzunluðunu kullanýcýdan aldýðýnýz üçgenin alanýný hesaplayan
	 * programý yazýnýz.
	 */

	public static void main(String[] args) {

		int birinciKenar, ikinciKenar, hipotenus;
		Scanner sc = new Scanner(System.in);
		System.out.print("Üçgenin birinci kenarný giriniz: ");
		birinciKenar = sc.nextInt();
		System.out.print("Üçgenin ikinci kenarýný giriniz: ");
		ikinciKenar = sc.nextInt();
		
		hipotenus =(int) ( Math.pow(birinciKenar,2) + Math.pow(ikinciKenar, 2));
		System.out.print("Hipotenus uzunluðu: " + Math.sqrt(hipotenus));
	
		System.out.println();
		
		// dik üçgende alan bulma 
		double dikÜcgenAlan = (birinciKenar * ikinciKenar) /2;
		System.out.print("Dik üçgenin alaný: " + dikÜcgenAlan);
		
		System.out.println();
		
		// üçgende alan bulma
		
		int ucuncuKenar;
		System.out.print("Üçgenin üçüncü kenarý: ");
		ucuncuKenar = sc.nextInt();
		
		int cevreYarýsý = (birinciKenar + ikinciKenar + ucuncuKenar) / 2;
		int alan = cevreYarýsý * (cevreYarýsý - birinciKenar) * (cevreYarýsý - ikinciKenar) * (cevreYarýsý - ucuncuKenar);
		
		System.out.println("Üçgenin alaný: " + Math.sqrt(alan));
	
	}
	

}
