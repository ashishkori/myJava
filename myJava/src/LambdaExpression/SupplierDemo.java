package LambdaExpression;


import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Date> d=()->new Date();
		System.out.println(d.get());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e)
		{}
		System.out.println(d.get());
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e)
		{}
		System.out.println(d.get());

	}

}
