package tryCatch;

import java.util.Timer;
import java.util.TimerTask;

public class Islem {
	public static void main(String[] args) {
		try {
			int a = 42 / 7;
		} catch (ArithmeticException bolmeHatas�) {
			System.out.println("b�lme hatas�");

		} finally {
			System.out.println("ba�ar�l�");
		}

		TimerTask task = new TimerTask() {
			int i = 0;

			public void run() {
				i++;
				System.out.println(i + "-merhaba");
				if (i == 8) {
					System.exit(0);
				}

			}
		};
		Timer t = new Timer();
		t.schedule(task, 0, 800);

		MyError error = new MyError();
		error.hataliFonk();
	}

}
