package matematik;

public class SoruBes {
	public int rakam() {
		// tek basamaklar için a
		int a = 9;
		int sayac1 = 0, sayac2 = 0;

		for (int b = 10; b < 100; b++)
			sayac1 += 2;

		for (int c = 100; c < 235; c++)
			sayac2 += 3;

		return sayac1 + sayac2 + a;
	}
	


}
