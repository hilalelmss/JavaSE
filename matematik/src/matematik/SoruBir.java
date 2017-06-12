package matematik;

public class SoruBir {

	public int minBasamak(int a, int b) {
		int h = a - a % 1000;
		int m = b - b % 100;
		int sonuc = (h * m);
		int sayac = 0;
		while (sonuc > 0) {
			sayac++;
			sonuc /= 10;
		}

		return sayac;

	}

}
