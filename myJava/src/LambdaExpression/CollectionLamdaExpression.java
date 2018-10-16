package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.*;

public class CollectionLamdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(12);
		l.add(102);
		l.add(1);
		l.add(-11);
		l.add(51);
		l.add(-50);
		l.add(1000);
		l.add(5);
		System.out.println(l);;
		Comparator<Integer> c=(f,s)->{
			return f>s?1:-1;
		};
		Collections.sort(l, c);
		System.out.println(l);
		l.stream().forEach(System.out::println);
		List<Integer> l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
