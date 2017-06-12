package abstractt;

public class Islem {
	public static void main(String[] args) {
		AVeriTabani aVeriTabani = new AVeriTabani() {

			@Override
			public void login() {
				System.out.println("averitabaný login");

			}
		};
		aVeriTabani.login();
		aVeriTabani.connection();
	}
}
