package telefon;

public class Islem {
	public static void main(String[] args) {
		Telefon telefon = new Telefon();
		telefon.arama();

		AkillliTel akillliTel = new AkillliTel();
		akillliTel.kamera();

		Dokunmatik dokunmatik = new Dokunmatik();
		dokunmatik.isletimSistemi();
		dokunmatik.kamera();

		Samsung samsung = new Samsung();
		samsung.isletimSistemi();

		Iphone iphone = new Iphone();
		iphone.isletimSistemi();

		Nokia nokia = new Nokia();
		nokia.isletimSistemi();

	}

}
