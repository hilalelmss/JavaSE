package ListYerDegistirme;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Islem {
	public static void main(String[] args) {
		List<String> meyveIsim = new ArrayList<>();
		meyveIsim.add("elma");
		meyveIsim.add("erik");
		meyveIsim.add("çilek");
		meyveIsim.add("kiraz");
		meyveIsim.add("karpuz");
		meyveIsim.add("nektar");
		meyveIsim.add("ananas");
		meyveIsim.add("mandalina");
		meyveIsim.add("portakal");
		meyveIsim.add("ayva");
		Iterator<String> myIterator = meyveIsim.iterator();
		while (myIterator.hasNext()) {
			System.out.print(myIterator.next()+"-");
		}
		for (int i = 0; i < meyveIsim.size(); i++) {
			meyveIsim.get(i);
		}
		

	}

}
