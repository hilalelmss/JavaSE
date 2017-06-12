package matematik;

public class OnYedi {
	public static int toplam() {
		int AAB, BB, A = 8, B = 0;
		AAB = (100 * A) + (10 * A) + B;
		BB = (11 * B);
		// AAB+ BB=110*A + 12*B;
		// 110*A + 12*B=940;
		if (A == 8) {
			// 940-110*8=12*B;
			B = (940 - 110 * 8) / 12;
			System.out.println(B);
		}

		return A + B;
	}
}
