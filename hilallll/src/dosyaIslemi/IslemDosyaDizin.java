package dosyaIslemi;

import java.util.List;
import java.io.File;

public class IslemDosyaDizin {
	public static void main(String[] args) {
		DizinDosya dizinDosya = new DizinDosya();
		File file = dizinDosya.dosyaAl("C:/eclipseDosya/elmas/er/kisi.txt");
		// dizinDosya.oku(file);

		List<String> myList = dizinDosya.oku(file);
		for (String veri : myList) {
			System.out.println(veri);

		}
	}
}
