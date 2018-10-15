package ExceptionHandling;

public class ExceptionHandlingDemo2 {
	//CASE 1 
	//static ArithmeticException e= new ArithmeticException();//java.lang.ArithmeticException
	static ArithmeticException e; //java.lang.NullPointerException
	public static void main(String ... args)
	{
		throw e;
	}
}
