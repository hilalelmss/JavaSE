package dosyaIslemi.veriTabanýOkuma.streamYazýcý;

import java.io.File;

public class Islem {
	public static void main(String[] args) {
		Yazici yazici = new Yazici();
		File file = new File("C:/eclipseDosya/afatsum/veriii.txt");
		String ver = "merhanaaaaaa";
		yazici.yaz(file, ver.getBytes());
	}
}
