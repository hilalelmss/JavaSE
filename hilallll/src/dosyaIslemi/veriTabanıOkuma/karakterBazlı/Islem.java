package dosyaIslemi.veriTabanýOkuma.karakterBazlý;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class Islem {
	public static void main(String[] args) {
		Okuyucu okuyucu = new Okuyucu();
		File file = okuyucu.dosyaAL("C:/eclipseDosya/afatsum/kiþiler.txt");

		List<String> myList = okuyucu.oku(file);
		for (String veri : myList) {
			System.out.println(veri);

		}

		Okuyucu okuyucu2 = new Okuyucu();
		File file2 = okuyucu2.dosyaAL("C:/eclipseDosya/afatsum/veriii.txt");

		List<String> myVeri = okuyucu2.oku(file2);

		List<Person> persons = new ArrayList<>();
		for (String veri : myVeri) {
			Person person = new Person(veri.split("#"));
			persons.add(person);
		}
		for (Person person : persons) {
			person.selam();
		}

	}
}
