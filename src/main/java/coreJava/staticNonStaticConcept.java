package coreJava;

public class staticNonStaticConcept {
	String name;
	String address;
	static String city="CANADA"; //class variables
	int i=0;
	
	public staticNonStaticConcept(String name, String address) {
		this.name = name;
		this.address = address;
		i++;
		System.out.println(i);
	}
//*******************
	public void getAddress() {
		System.out.println(address + "  " + city );
		
	}
//************
	public static void main(String[] args) {

		
			
		staticNonStaticConcept obj = new staticNonStaticConcept("rahul","dwarka");
		staticNonStaticConcept obj1 = new staticNonStaticConcept("rahul11","dwarka11");
		
		obj.getAddress();
		obj1.getAddress();
		
	}
}
