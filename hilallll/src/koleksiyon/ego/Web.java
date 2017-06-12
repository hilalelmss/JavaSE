package koleksiyon.ego;

import java.util.List;

public class Web {
	public static void main(String[] args) {
		ListDoldur doldur = new ListDoldur();
		List<Ego> list = doldur.egolariDoldur();
		
		for (Ego ego : list) {
			System.out.println(ego.getTur());

		}
	}

}
