package abstractt;

public class Islem {
	public static void main(String[] args) {
		AVeriTabani aVeriTabani = new AVeriTabani() {

			@Override
			public void login() {
				System.out.println("averitaban� login");

			}
		};
		aVeriTabani.login();
		aVeriTabani.connection();
	}
}
