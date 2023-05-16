package coreJava;

public class ThisConcept {
	//this alays refer to the class/global variables
	//when u want to use global variables inside any method then they can be called using this
	
	static int a=2;
	
	
	public static void main(String[] args) {
		ThisConcept td = new ThisConcept();
		td.getData();
		System.out.println("Value of a is now " + a);
	}

	private void getData() {
		int a = 3;
		System.out.println("method level or local variable is " + a);
		System.out.println("global value printed inside method which has same vaiable name" + this.a);
		
	}
	
	private void convLocalVarToGlobal() {
		int a= 10;
		a = this.a;
		
	}

}
