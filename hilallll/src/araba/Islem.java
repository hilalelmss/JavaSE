package araba;

public class Islem {
	public static void main(String[] args) {
		Araba araba=new Araba();
		araba.setMarka("bmw");
		araba.setRenk("siyah");
		Araba araba2=new Araba("ford");
		araba2.setRenk("kırmız");
		System.out.println(araba2.getRenk() + araba.getMarka());

	}
}
