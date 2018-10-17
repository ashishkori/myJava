package LambdaExpression;

import java.util.function.IntPredicate;

public class IntPredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IntPredicate p=(i)->i%2==0;
		int [] a= {1, 2, 3, 4, 5, 6, 7, 15, 564, 124, 6};
		for(int x:a)
		{
			if(p.test(x))
				System.out.print(x+ " ");
		}
		System.out.println();

	}

}
