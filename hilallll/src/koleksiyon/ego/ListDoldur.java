package koleksiyon.ego;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class ListDoldur {
	public ListDoldur() {

	}

	public List<Ego> egolariDoldur() {
		Ego ego1 = new Ego(1, "06", "man");
		Ego ego2 = new Ego(2, "334", "woman");

		List<Ego> egoList = new LinkedList<>();
		egoList.add(ego1);
		egoList.add(ego2);

		return egoList;

	}

}
