package ExceptionHandling;

public class ExceptionHandlingDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		//CASE :2
		System.out.println(10/0); // RE: java.lang.ArithmeticException: / by zero
		System.out.println("Hello"); 
*/
/*		throw new ArithmeticException("/ by zero"); // CE: Unresolved compilation problem: 	Unreachable code

		System.out.println("Hello");
*/	
		throw new Test();
		
		}

}

 class Test extends RuntimeException{
 
	
} // RE:  ExceptionHandling.Test

/*
class Test{
	
} //CE: No exception of type Test can be thrown; an exception type must be a subclass of Throwable

*/