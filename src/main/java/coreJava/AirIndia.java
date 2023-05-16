package coreJava;

public class AirIndia extends  ParentAircraft{

	public static void main(String[] args) {
	
		AirIndia airInd = new AirIndia();
		airInd.engine(); // non abstract mehod from parent class
		airInd.bodyColor(); //abstract method from parent class
		
		
	}

	@Override
	public void bodyColor() {
		System.out.println("set of rulles code executed");
		
	}

}
