package dosyaIslemi.veriTabanýOkuma;

public class Person {
	int TC;
	String isim, soyad;

	public Person(String[] array) {
		this.TC = Integer.parseInt(array[0]);
		this.isim = array[1];
		this.soyad = array[2];

	}

	public void selamVer() {
		System.out.println("selam olsun " +this.isim);
	}
}
