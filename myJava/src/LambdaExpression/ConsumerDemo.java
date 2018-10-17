package LambdaExpression;

import java.util.function.Consumer;

public class ConsumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Consumer Example");
		Consumer<String> c=(s)->System.out.println(s);
		c.accept("Ashish");
		c.accept("afaf");

	}

}
