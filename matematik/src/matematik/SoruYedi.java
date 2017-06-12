package matematik;

import java.util.Random;

public class SoruYedi {
	public int kacArtar() {
		Random random = new Random();
		int a = random.nextInt(9);
		int b = random.nextInt(9);
		int c = random.nextInt(9);

		int x = 20 * ((a * 100) + (b * 10) + c);
		int xYeni = 20 * (((a + 1) * 100) + ((b - 2) * 10) + (c + 5));
		return xYeni - x;

	}

}
