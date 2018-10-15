package ExceptionHandling;

public class CustomizedExceptionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age=11;
		if(age<18)
		{
			 TooYoungException t=new TooYoungException("Too Young for Marrige try after few Years");
			 throw t;
		}
		else if(age>60)
		{
			throw new TooOldException("Too Old to marrige you will not find any match here");
		}
		else
		{
			System.out.println("Very soon you will receive Maching Email");
		}
	}

}
class TooYoungException extends RuntimeException
{
	TooYoungException(String s)
	{
		super(s);// To make our description available to Default Exception Handler
	}
}

class TooOldException extends RuntimeException
{
	TooOldException(String s)
	{
		super(s);// To make our description available to Default Exception Handler
	}
	}