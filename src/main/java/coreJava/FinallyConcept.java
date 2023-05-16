package coreJava;

public class FinallyConcept {

	public static void main(String[] args) {
		
		//Finally
		//This block will be executed irrespective to error thrown or not
		//Even if script passes or fails, then still script comes to finally block and executes the code
		// if script fails in between then delete cookies and continue
		
		try  
        {  
        int data=50/10; //may throw exception   
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
		finally
		{
		System.out.println("Execute the code ireespetive of pass or fail");
		}


	}

}
