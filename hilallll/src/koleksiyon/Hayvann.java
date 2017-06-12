package koleksiyon;

import java.util.Scanner;

public class Hayvann {
	int id;
	String tur, name;
	Scanner scanner = new Scanner(System.in);

	public Hayvann(int id, String name, String tur) {
		this.id = id;
		this.tur = tur;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getTur() {
		return tur;
	}

	public static Hayvann createHayvna(int id, String tur) {

		return new Hayvann(1, "isim", "tur");
	}

}
