package matematik;

public class CarpimTablosu {
	public static void main(String[] args) {
		System.out.print("\t");
		System.out.println("* * * * * * * * * * * * * *  H�LAL ELMAS  * * * * * * * * * * * * *");
		System.out.print("\t");
		/* ilk sat�r */
		for (int k = 1; k < 11; k++) {
			System.out.print(k + "\t");
		}
		System.out.println();
		System.out.println("    " + "_________________________________________________________________________________");
		System.out.println();

		/* �arpma i�lemleri tablo */

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + "|");
			for (int j = 1; j <= 10; j++) {

				System.out.print("\t");

				System.out.print(i * j);

			}
			System.out.println(" ");
		}

	}
}
