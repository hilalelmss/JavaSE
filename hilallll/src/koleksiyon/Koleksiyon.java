package koleksiyon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.print.attribute.HashAttributeSet;

public class Koleksiyon {
	public static void main(String[] args) {
		HashSet<String> myArray = new HashSet<>();
		myArray.add("mustafa");
		myArray.add("hilal");
		System.out.println(myArray);
		System.out.println(myArray.size());

		HashSet<String> myHash = new HashSet<>();
		myHash.add("hersey");
		myHash.addAll(myArray);
		System.out.println(myHash);

		Set<Integer> kod = new HashSet<>();
		kod.add(101);
		kod.add(102);
		System.out.println(kod);

		Iterator<String> myIterator = myArray.iterator();
		while (myIterator.hasNext()) {
			System.out.println(myIterator.next());
		}

	}

}
