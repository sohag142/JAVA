package Car;

public class CarClass {
	
		public String manufactureName;
		private String modelName;
		private String Carkeyvalue;
		public int engineCC;
		private float fuelamount;
		final private float amountoffuelconsumedpresecend = 0.02f;
		
		
		 public CarClass() {
			 manufactureName = new String();
			 modelName = new String();
			 engineCC=1000;
			 fuelamount=0;
		}
		 
		public CarClass(String carname) {
			manufactureName = new String(carname);
			 modelName = new String();
			 engineCC=0;
			 fuelamount=0;
		}
		
		public CarClass (String manu,String model,String key,int cc,float fuleamount) {
			manufactureName = manu;
			modelName = model;
			Carkeyvalue = key;
			engineCC = cc;
			this.fuelamount = fuleamount;
		}
		
		public float presentAmountoffuel() {
			return fuelamount;
		}
		
		public String getManufactureName() {
			return manufactureName;
		}
		
		public  String getmodelName() {
			return modelName;
		}
		
		public void addfuel(float fuelamount) {
			this.fuelamount+=fuelamount;
		}
		
		public void runforsecend(int secendintime) {
			float usedfuel = secendintime*amountoffuelconsumedpresecend;
			fuelamount -=usedfuel;
		}
		
		public boolean matchpassword(String userinput) {
			return userinput.equals(Carkeyvalue);
		}	
	}


