package ExceptionHandling;

public class ExceptionHandlingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Exception Handling");
		try {
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e) 
		{
			System.out.println("Devide By Zero Exception");
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			}
		/*catch(Exception e) 
		{
			e.printStackTrace();
		//	System.out.println(e.getMessage());
		//	System.out.println(e);
		//	System.out.println(e.toString());
			}
		catch(ArithmeticException e) 
		{System.out.println(e);} // It is already handled by the catch block for Exception
	*/	
		//System.out.println(10/0);
		System.out.print("Next Statment");;
		

	}

}
