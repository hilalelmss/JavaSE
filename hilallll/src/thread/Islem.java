package thread;

public class Islem {
	public static void main(String[] args) {
		System.out.println("merhaba");
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		SayiDon don = new SayiDon();
		SayiDon2 don2=new SayiDon2();
		Thread thread = new Thread(don);
		Thread thread2=new Thread(don2);
		thread.start();
		for (int i = 0; i < 50; i++) {
			System.out.println(i+" kalp");
		}
		
		thread2.start();
	synchronized (thread) {
			try {
				thread.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
	}
	}
}
