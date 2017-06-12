package koleksiyon;

import java.util.HashSet;
import java.util.Iterator;

public class HayvanIslem {
	public static void main(String[] args) {
		
		HashSet<Hayvann> myList = new HashSet<>();
		Hayvann aslan = new Hayvann(1, "aslan", "yýrtýcý");
		Hayvann yilan = new Hayvann(2, "yilan", "sürüngen");
		myList.add(aslan);
		myList.add(yilan);

		Iterator<Hayvann> it = myList.iterator();
		while (it.hasNext()) {
			Hayvann hayvann = it.next();
			System.out.println(hayvann.getName());
		}
		
		for (Hayvann hayvann : myList) {
			System.out.println(hayvann.getTur());
		}
	}

}
