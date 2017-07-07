package matematik;

import java.util.Scanner;

public class Fonksiyon {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int sayi;
		int sayac = 0;
		int sonuc = 0;
		double ortalama;
		for (int i = 1; i <5; i++) {
			System.out.println(i + ". sayýyý girin:");
			sayi = scanner.nextInt();
			sonuc += sayi;
			sayac++;
		}
		ortalama = sonuc / sayac;

		System.out.println(tekMiCiftMi(ortalama));

	}

	public static int tekMiCiftMi(double ortalama) {
		int son;
		if (ortalama % 2 == 0) {
			son = ciftOrt(ortalama);
		} else {
			son = tekOrt(ortalama);
		}
		return son;
	}

	public static int tekOrt(double sonuc) {
		int deger = (int) Math.pow(3, sonuc);
		return deger;
	}

	public static int ciftOrt(double sonuc) {
		int deger = (int) Math.pow(2, sonuc);
		return deger;
	}
}
