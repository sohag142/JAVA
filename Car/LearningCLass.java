package Car;

public class LearningCLass {
	
	static private CarClass ourcar = new CarClass() ;
	static private CarClass ouranotherCar ;
	
	public static void main(String[] args) {
		
		CarClass thirdCar = new CarClass("MASDA","AXELA","SFFDA",2000,20);
		
		subcarclass ourSubcar = new subcarclass("BMW","7 SERICES","DFSS",3000,25,30,"GRAY");
		
		ouranotherCar = new CarClass("TOYoTA","ALLION","FHDKJH",1500,30);
		
		System.out.println("Manufacturer : "+ouranotherCar.getManufactureName());
		System.out.println("Model Name :"+ouranotherCar.getmodelName());
		System.out.println("password Mstch : "+ouranotherCar.matchpassword("jhfdjhsj"));
		System.out.println("1st cr cc:"+ourcar.engineCC);
		System.out.println("anothercar car cc:"+ouranotherCar.engineCC);
		System.out.println("Amount of fuel:"+ouranotherCar.presentAmountoffuel()+"L");
		ouranotherCar.addfuel(5);
		System.out.println("Amount of fuel after addind 5L:"+ouranotherCar.presentAmountoffuel());
		ouranotherCar.runforsecend(60);
		System.out.println("Amount of fuel after driving for 60 sec:"+ouranotherCar.presentAmountoffuel());
		System.out.println("\n");
		
		System.out.println("Manufacturer : "+thirdCar.manufactureName);
		System.out.println("Model Name :"+thirdCar.getmodelName());
		System.out.println("password Mstch : "+thirdCar.matchpassword("jhfdjhsj"));
		System.out.println(" car cc:"+thirdCar.engineCC);
		System.out.println("Amount of fuel:"+thirdCar.presentAmountoffuel()+"L");
		thirdCar.addfuel(5);
		System.out.println("Amount of fuel after addind 5L:"+thirdCar.presentAmountoffuel());
		thirdCar.runforsecend(60);
		System.out.println("Amount of fuel after driving for 60 sec:"+thirdCar.presentAmountoffuel());
		System.out.println("\n");
		
		System.out.println("Manufacturer : "+ourSubcar.manufactureName);
		System.out.println("Model Name :"+ourSubcar.getmodelName());
		System.out.println("password Mstch : "+ourSubcar.matchpassword("DFSS"));
		System.out.println(" car cc:"+ourSubcar.engineCC);
		System.out.println("Amount of fuel:"+ourSubcar.presentAmountoffuel()+"L");
		System.out.println("Amount of fuel after addind 5L:"+ourSubcar.presentAmountoffuel());
		ourSubcar.runforsecend(60);
		System.out.println("Amount of fuel after driving for 60 sec:"+ourSubcar.presentAmountoffuel());
		System.out.println("CHARGE in Battary: " +ourSubcar.getChargInBattery());
		System.out.println("Car cloler: "+ourSubcar.getColorString());
		System.out.println("\n");
		
		
		
		


	}

}
