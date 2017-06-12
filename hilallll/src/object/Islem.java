package object;

import java.util.ArrayList;

public class Islem {
	public static void main(String[] args) {
		Object object = new Person();
		Object object2 = new ArrayList<>();
		Object object3 = new String("selamlar");
		gonder(object);
	}

	public static void gonder(Object object) {
		Person person = (Person) object;
		System.out.println(person.i);
		System.out.println(person.s);
	}
}
