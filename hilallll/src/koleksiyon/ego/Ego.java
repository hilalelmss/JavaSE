package koleksiyon.ego;

public class Ego {
	int id;
	String tur, plaka;

	public Ego(int id, String tur, String plaka) {
		this.id = id;
		this.plaka = plaka;
		this.tur = tur;
	}

	public int getId() {
		return id;
	}

	public String getPlaka() {
		return plaka;
	}

	public String getTur() {
		return tur;
	}
}