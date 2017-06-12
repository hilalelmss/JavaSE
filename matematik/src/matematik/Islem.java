package matematik;

public class Islem {
	public static void main(String[] args) {
		SoruBir bir = new SoruBir();
		System.out.println("Soru 1:" + bir.minBasamak(1273, 728));

		SoruIki iki = new SoruIki();
		System.out.println("Soru 2:" + iki.toplamFarki());

		SoruUc uc = new SoruUc();
		System.out.println("Soru 3:" + uc.sayilarToplami());

		SoruBes bes = new SoruBes();
		System.out.println("Soru 5:" + bes.rakam());

		SoruAlti alti = new SoruAlti();
		System.out.println("Soru 6:" + alti.sonuc);

		SoruYedi yedi = new SoruYedi();
		System.out.println("Soru 7:" + yedi.kacArtar());

		SoruSekiz sekiz = new SoruSekiz();

		System.out.println("soru 9:" + alti.SoruDokuz());

		SoruOn on = new SoruOn();
		
		
		OnBir onBir=new OnBir();
		System.out.println("Soru 11:" + onBir.ikiBas());
		
		OnIki onIki=new OnIki();
		System.out.println("Soru 12:" + onIki.toplam());
		
		OnUc onUc=new OnUc();
		//onUc.kacSayi();
		System.out.println("Soru 13:" + onUc.kacSayi());
		
		OnYedi onYedi=new OnYedi();
		System.out.println("Soru 17:" + onYedi.toplam());

	}

}
