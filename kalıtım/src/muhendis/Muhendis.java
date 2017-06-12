package muhendis;

public class Muhendis {
	private String diploma;

	public void matematik() {
		System.out.println("matemtaik bilgisi");
	}

	public void turkce() {
		System.out.println("turkçe");
	}

	public void setDiploma(String diploma) {
		this.diploma = diploma;
	}

	public String getDiploma() {
		return diploma;
	}
}
