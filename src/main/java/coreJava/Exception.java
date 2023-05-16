package coreJava;

public class Exception {

	public static void main(String[] args) {

		//Exception handling
		//try catch
		//1 try can be followed by multiple catch blocks
		//Exception e)  - this is general exception for any error this supports
		
		try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
        	System.out.println("I have catched the exception");  
        }  
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("index of bound exception");
			
		}
          
    }  
}

	

