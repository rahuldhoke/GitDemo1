package coreJava;

public class constructorDemo {
	
	//automatically constructor is called when u create object
	//constructor wont return any value
	//name of constructor shoud be class name 
	//globally used objects, variable can be created inside class
	//to call constructor we have to create object of that class and call it inside main method
	//we can create multiple constructor with parameters
	//We can call multiple constructor by creating multiple object inside class
	
	public constructorDemo() {
		System.out.println(" I am insite constructor");
	}
	
	public constructorDemo(int A, int B) {
		System.out.println(" I am insite parameterized constructor");
	}
	
	public static void main(String[] args) {
		constructorDemo cd = new constructorDemo();
		constructorDemo cdPara = new constructorDemo(1,2);
	}

}
