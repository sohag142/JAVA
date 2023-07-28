package Car;

public class subcarclass extends CarClass {
	
	private float chargInBattery;
	private String colorString; 
	public  subcarclass() {
		super();
	}
	
	public subcarclass(String manu,String model,String key,int cc,float fuleamount,float cr,String clr) {
		super(manu,model,key,cc,fuleamount);
		chargInBattery =cr;
		colorString = clr;
	}
	
	public float getChargInBattery() {
		return chargInBattery;
	}
	
	public void setChargInBattery(float chargInBattery) {
		this.chargInBattery = chargInBattery;
	}
	
	public String getColorString() {
		return colorString;
	}
	
	public void setColorString(String colorString) {
		this.colorString = colorString;
	}
}
