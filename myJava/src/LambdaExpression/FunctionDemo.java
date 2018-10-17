package LambdaExpression;

import java.util.function.Function;

public class FunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Function Example ");
		Function <Integer, Integer> f=(i)->i*i;
		System.out.println(f.apply(4));
		System.out.println(f.apply(5));
		Function<String, Integer> s=(S)->S.length();
		System.out.println("Length: "+s.apply("Ashish"));
		System.out.println("Length: "+s.apply("Kumar Kori"));
	}

}
