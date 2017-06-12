package matematik;

public class SoruUc {
	public int sayilarToplami() {
		int b, a, ucBasamakliSayilar = 0;
		for (int c = 0; c < 4; c++) {
			b = 2 * c + 1;
			a = b + 1;
			ucBasamakliSayilar += (a * 100) + (b * 10) + (c);

			// System.out.print(ucBasamakliSayilar + " - ");
		}
		return ucBasamakliSayilar;

	}

}
