package araba;

public class Araba {
	private int model;
	public int getModel() {
		return model;
	}
	public Araba(){
		System.out.println("arabaa");
	}
	public Araba(String marka){
		this.marka=marka;
		
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public double getMotorGucu() {
		return motorGucu;
	}
	public void setMotorGucu(double motorGucu) {
		this.motorGucu = motorGucu;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	private String marka;
	private double motorGucu;
	private String renk;

}
