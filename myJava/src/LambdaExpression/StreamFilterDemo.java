package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(120);
		l.add(11);
		l.add(21);l.add(36);l.add(37);l.add(10);l.add(53);l.add(53);l.add(52);l.add(58);
		l.add(59);
		System.out.println(l);
		List<Integer> l2=l.stream().filter((i)->i%2==0).collect(Collectors.toList());
		System.out.println(l2);
	}

}
