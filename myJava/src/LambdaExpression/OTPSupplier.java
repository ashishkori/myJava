package LambdaExpression;

import java.util.function.Supplier;

public class OTPSupplier {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<String>s=()->{
			String otp="";
			for(int i=0;i<6;i++)
			{
				otp=otp+(int)(Math.random()*10);
				
			}
			return otp;
		};
		for(int i=0;i<10;i++)
		{
			System.out.println(s.get());
			
		}
		
	}

}
