package matematik;

public class OnBir {
	// MN iki basamaklý sayý
	// M*x ve N*x ortak çarpaný 5 alýrsak

	public static int ikiBas() {
		int m = 0, n = 0, x = 5;
		if (x == 5) {
			try {
				m = 30 / x;
				n = 40 / x;
			} catch (ArithmeticException e) {
				System.out.println(" x=0 olduðunda " + e);
			}
		}

		return (m * 10 + n) * x;

	}
}
