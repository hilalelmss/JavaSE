package matematik;

public class OnUc {
	public static int kacSayi() {
		int a, sayac = 0;

		// if (9 * (a - b) == 27) {
		
			for (a = 9; a < 4; a--) {
			for(int b=6;b<a;b--){
				if (a - b == 3)
				System.out.println(a + "-" + b);
			sayac++;
			}
		}
		return sayac;
	}

}
