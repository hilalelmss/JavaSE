package koleksiyon;

public class KoleksynClass {
	int TC;
	String adi, soyadi;

	public KoleksynClass(int TC, String adi) {
		this.TC = TC;
		this.adi = adi;
		this.soyadi = soyadi;
	}

	public String getAdi() {
		return adi;
	}

	public String getSoyadi() {
		return soyadi;
	}

	public int getTC() {
		return TC;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	public void setSoyadi(String soyadi) {
		this.soyadi = soyadi;
	}

	public void setTC(int tC) {
		TC = tC;
	}

}
