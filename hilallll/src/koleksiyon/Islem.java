package koleksiyon;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Islem {
	public static void main(String[] args) {
		HashSet<String> myHash = new HashSet<>();

		Set<KoleksynClass> myList = new HashSet<>();
		KoleksynClass class1 = new KoleksynClass(185, "aþk");
		myList.add(class1);
		Iterator<KoleksynClass> it = myList.iterator();
		System.out.println(myList);
	}
}
