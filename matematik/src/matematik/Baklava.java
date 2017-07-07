package matematik;

public class Baklava {
	public static void main(String[] args) {
		System.out.println("****HÝLAL ELMAS****");
		int k = 0;
		while (k <= 11) {
			int bosluk = 10;
			while (bosluk >= (k)) {
				System.out.print(" ");
				bosluk -= 2;
			}
			k += 2;
			int l = 1;
			while (l < k) {
				System.out.print("*");
				l++;
			}
			System.out.println();
		}
		int a = 11;
		while (a > 0) {
			int c = 0;
			while (c <= 6 - a / 2) {
				System.out.print(" ");
				c++;
			}
			a -= 2;
			int b = 0;
			while (b < a) {
				System.out.print("*");
				b++;
			}
			System.out.println();
		}
	}
}
