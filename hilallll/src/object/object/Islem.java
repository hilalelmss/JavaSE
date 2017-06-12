package object.object;

import java.util.Scanner;

public class Islem {
	public static void main(String[] args) {
		Object intVeri = new Integer(6);
		Object stringVeri = new String("Selamlar");
		Object scanVeri = new Scanner(System.in);
		gonder(intVeri);
		gonder(stringVeri);

		Object otobus = new Otobus();
		Object minibus = new Minibus();
		soyle(otobus);
		soyle(otobus, true);
		soyle(minibus);
		soyle(minibus, true);

	}

	public static void soyle(Object obj) {
		if (obj instanceof Otobus) {
			Otobus oto = (Otobus) obj;
			System.out.println(oto.yolcuSayisi);

		}
		if (obj instanceof Minibus) {
			Minibus mini = (Minibus) obj;
			System.out.println(mini.yolcuSayisi);

		}
	}

	// IF_THEN_ELSE
	public static void soyle(Object obj, boolean control) {
		int veri = obj instanceof Otobus ? ((Otobus) obj).getYolcuSayisi() : ((Minibus) obj).getYolcuSayisi();
		System.out.println(veri);

	}

	public static void gonder(Object obj) {
		if (obj instanceof Integer) {
			Integer veri = (Integer) obj;
			System.out.println(veri);
		}
		if (obj instanceof String) {
			System.out.println((String) obj);
		}
	}

}
