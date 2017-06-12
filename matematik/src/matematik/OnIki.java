package matematik;

import java.util.Random;
//Sýkýntýlý soru!!!
public class OnIki {
	public static int toplam() {
		Random random = new Random();
		int a = random.nextInt(9);
		int b = random.nextInt(9);
		try{
		int ab = 10 * a + b;
		int ba = 10 * b + a;
	
		
		}catch (Exception e) {
		System.out.println(e.getMessage());
		}
		
		return 11*(a+b);
		

	}
}
