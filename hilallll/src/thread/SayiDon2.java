package thread;

public class SayiDon2 implements Runnable {

	@Override
	public void run() {
for (int i = 0; i < 60; i++) {
	System.out.println(i+"%");
}		
	}

}
