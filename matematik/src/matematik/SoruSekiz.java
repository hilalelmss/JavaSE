package matematik;

public class SoruSekiz {
	public SoruSekiz() {
		int a = 1, c = 1;
		int dogruCozum = 20 * ((a * 100) + (2 * 10) + (c));
		int yanlisCozum = 20 * ((a * 100) + (4 * 10) + (c));
		int sonuc = 6880 - (yanlisCozum - dogruCozum);
		System.out.println("Soru 8:" + sonuc);
	}

}
