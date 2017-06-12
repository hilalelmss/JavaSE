package dosyaIslemi.veriTabanýOkuma;

import java.util.ArrayList;
import java.util.List;

import dosyaIslemi.DizinDosya;

public class Islem {
	public static void main(String[] args) {
		DizinDosya dizinDosya = new DizinDosya();
		// dizinDosya.dosyaAl("C:/eclipseDosya/person.txt");
		List<String> myList = dizinDosya.oku(dizinDosya.dosyaAl("C:/eclipseDosya/person.txt"));

		List<Person> persons = new ArrayList<>();
		for (String string : myList) {
			Person person = new Person(string.split("#"));
			persons.add(person);
		}
		for (Person person : persons) {
			person.selamVer();
		}

	}
}
