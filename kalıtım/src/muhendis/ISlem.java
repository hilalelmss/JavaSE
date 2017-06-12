package muhendis;

public class ISlem {
	public static void main(String[] args) {
		Muhendis muhendis = new Muhendis();
		muhendis.turkce();

		InsaatMuhendis insaatMuhendis = new InsaatMuhendis();
		insaatMuhendis.matematik();
		insaatMuhendis.setDiploma("dIpLoMa");
		System.out.println(insaatMuhendis.getDiploma());
		bil();
	}

	public static void bil() {
		BilgisayarMuhendis bilgisayarMuhendis = new BilgisayarMuhendis();
		bilgisayarMuhendis.matematik();

	}
}
