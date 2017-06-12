package bisikletInterface;

public class Bisiklet implements IBisiklet{

	@Override
	public void pedal() {
		System.out.println("bisiklet pedal");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void fren() {
		System.out.println("bisiklet frren");
		diskFren();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vites() {
		System.out.println("bisiklet vtes");
		// TODO Auto-generated method stub
		
	}
	public void diskFren(){
		System.out.println("disk fren");
		
	}

}
