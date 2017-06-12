package insaat;

public class Islem {
	public static void main(String[] args) {
		Isci isci=new Isci();
		isci.setId(123);
		isci.setIsmi("xxx");
		System.out.println(isci.getId() + isci.getIsmi());
		
		Muhendis muhendis=new Muhendis();
		muhendis.setIsmi("yy");
		System.out.println(muhendis.getIsmi());

		Insaat insaat=new Insaat("aaa");
		Insaat insaat2=new Insaat("aa","bb");

	}

}
