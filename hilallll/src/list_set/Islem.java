package list_set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Islem {
	public static void main(String[] args) {
		List<Person> personList = new ArrayList<>();
		Person person1 = new Person("hilal");
		Person person2 = new Person("mustafa");
		Person person3 = new Person("elmas");
		Person person4 = new Person("ergan");
		Person person5 = new Person("hocamm");
		personList.add(person1);
		personList.add(person2);
		personList.add(person3);
		personList.add(person4);
		personList.add(person5);

		for (Person person : personList) {
			System.out.println(person.getIsim());
		}
		System.out.println("----");

		Set<Person> personsetList = new HashSet();
		personsetList.add(person1);
		personsetList.add(person2);
		personsetList.add(person3);
		personsetList.add(person4);
		personsetList.add(person5);
		Iterator<Person> iterator = personsetList.iterator();
		while (iterator.hasNext()) {
			Person person = (Person) iterator.next();
			System.out.println(person.getIsim());
		}

	}
}
