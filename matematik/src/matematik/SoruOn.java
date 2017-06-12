package matematik;

import java.util.Random;

public class SoruOn {
	public SoruOn() {
		Random random = new Random();

		int a = random.nextInt(5);
		int b = random.nextInt(5);
		int c = random.nextInt(5);
		int d = random.nextInt(5);
		int e = random.nextInt(5);

while(a+b== d+e){
	System.out.println(a+ "-" + b +"- "+ c +"-"+ d +"- "+e);
}	}

}
