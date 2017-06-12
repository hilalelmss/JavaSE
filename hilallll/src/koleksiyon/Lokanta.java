package koleksiyon;

public class Lokanta {
	String name, adres;

	public Lokanta(String name, String adres) {
		this.adres = adres;
		this.name = name;
	}

	public String getAdres() {
		return adres;
	}

	public String getName() {
		return name;
	}
}
