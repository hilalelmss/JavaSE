package matematik;

public class OnBir {
	// MN iki basamakl� say�
	// M*x ve N*x ortak �arpan� 5 al�rsak

	public static int ikiBas() {
		int m = 0, n = 0, x = 5;
		if (x == 5) {
			try {
				m = 30 / x;
				n = 40 / x;
			} catch (ArithmeticException e) {
				System.out.println(" x=0 oldu�unda " + e);
			}
		}

		return (m * 10 + n) * x;

	}
}
