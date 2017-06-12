package dosyaIslemi.veriTabanýOkuma.karakterBazlý;

import java.util.ArrayList;
import java.util.List;
import java.io.File;

public class IslemYazici {
public static void main(String[] args) {
		Okuyucu okuyucu = new Okuyucu();
		File file = okuyucu.dosyaAL("C:/eclipseDosya/afatsum/veriii.txt");
		
		List<String> myList = okuyucu.oku(file);

		List<Person> persons = new ArrayList<>();
		for (String veri : myList) {
			Person person = new Person(veri.split("#"));
			persons.add(person);
		}
		for (Person person : persons) {
			person.selam();
		}

		Yazici yazici = new Yazici();
		yazici.yaz("C:/eclipseDosya/yaz.txt", persons);
	}
}
