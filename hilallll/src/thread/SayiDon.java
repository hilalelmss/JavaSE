package thread;

public class SayiDon implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 70; i++) {
			System.out.println("sayýdon");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
	}

}
