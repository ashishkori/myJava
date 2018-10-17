package LambdaExpression;

import java.util.function.BiPredicate;

public class BiPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<Integer,Integer> p=(i1,i2)->(i1+i2)%2==0;
		System.out.println(p.test(10,11));
		System.out.println(p.test(10,20));
		BiPredicate<String,String> p1=(i1,i2)->{return i1.equals(i2);};
		System.out.println(p1.test("Ashish","Ashish"));
		System.out.println(p1.test("Ashish","Ashish Kumar"));

	}

}
