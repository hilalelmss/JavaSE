package dosyaIslemi.veriTabanýOkuma.StreamOkuyucu;

import java.io.File;

public class Islem {
	public static void main(String[] args) {
		File file = new File("C:/eclipseDosya/afatsum/veriii.txt");
		Okuyucu okuyucu = new Okuyucu();
		okuyucu.oku(file);
	}
}
