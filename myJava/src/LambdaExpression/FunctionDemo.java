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
		
		Function<Integer, Integer> f2=(i)->2*i;
		Function<Integer, Integer> f3=(i)->i*i*i;
		System.out.println(f2.andThen(f3).apply(3));
		System.out.println(f2.compose(f3).apply(3));
	}

}
