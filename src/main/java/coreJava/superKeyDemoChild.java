package coreJava;

public class superKeyDemoChild extends SuperKeDemo_Parent {

	String name = "childname";
	
	public static void main(String[] args) {
		
		superKeyDemoChild clddemo = new superKeyDemoChild();
		clddemo.getStringdata();
		clddemo.DupMethod();
		
	}

public superKeyDemoChild(){
	super();
	System.out.println("child class constructor");
	
}


public void getStringdata() {
	
	System.out.println(name);	
	System.out.println(super.name);
	

	super.DupMethod();
		
	}

public void DupMethod() {
	System.out.println("i am in child class");
	}

}