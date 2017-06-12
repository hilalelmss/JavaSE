package dosyaIslemi.veriTabanýOkuma.karakterBazlý;

public class Person {
	int TC;
	String isim, soyad;

	public Person(String[] array) {
		this.TC = Integer.parseInt(array[0]);
		this.isim = array[1];
		this.soyad = array[2];
	}

	public void selam() {
		System.out.println("selam genc  " + this.isim);
	}

	public int getTC() {
		return TC;
	}

	public void setTC(int tC) {
		TC = tC;
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getSoyad() {
		return soyad;
	}

	public void setSoyad(String soyad) {
		this.soyad = soyad;
	}
}
