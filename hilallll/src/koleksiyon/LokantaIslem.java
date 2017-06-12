package koleksiyon;

import java.util.HashSet;

public class LokantaIslem {
	public static void main(String[] args) {
		Lokanta[] lokantaArray = new Lokanta[3];
		Lokanta lokanta1 = new Lokanta("1", "aaaaaaaaa");
		Lokanta lokanta2 = new Lokanta("2", "aaasss");
		Lokanta lokanta3 = new Lokanta("3", "bbaasss");

		HashSet<Lokanta> myList = new HashSet<>();
		myList.add(lokanta1);
		myList.add(lokanta2);
		myList.add(lokanta3);
		
		for (Lokanta lokanta : myList) {
			System.out.println(lokanta.getName());
		}
		

	}
}
