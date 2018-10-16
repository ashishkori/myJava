package LambdaExpression;

import java.util.function.Predicate;

public class PredicateDemo2 {
	public static void main( String [] args)
	{
		System.out.println("Predicate Joining Example");
		int x[] ={100,21,201,2,3,4,10,20,23,24,9,25,26,7,28,29,30};
		Predicate<Integer> p1=(i)->i>10;
		Predicate<Integer> p2=(i)->i%2==0;
		Predicate<Integer> p3=(i)->i%2==1;
		System.out.println("Even and Greter then 10");
		for(int i1:x)
		{
			if(p1.and(p2).test(i1))
				System.out.print(i1+" ");
		}
		System.out.println();
		System.out.println("Odd and Greter then 10");
		for(int i1:x)
		{
			if(p1.and(p3).test(i1))
				System.out.print(i1+" ");
		}
		System.out.println();
		System.out.println("Odd or Greter then 10");
		for(int i1:x)
		{
			if(p1.or(p3).test(i1))
				System.out.print(i1+" ");
		}
		System.out.println();
		System.out.println("Even or Greter then 10");
		for(int i1:x)
		{
			if(p1.or(p2).test(i1))
				System.out.print(i1+" ");
		}
		System.out.println();
		System.out.println("Not Even");
		for(int i1:x)
		{
			if(p1.negate().test(i1))
				System.out.print(i1+" ");
		}
		System.out.println();
		System.out.println("Not Even and Less then equal to 10");
		for(int i1:x)
		{
			if(p1.negate().and(p2).test(i1))
				System.out.print(i1+" ");
		}
		System.out.println();

	}
}
