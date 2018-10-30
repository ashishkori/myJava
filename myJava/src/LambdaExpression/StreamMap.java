package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> l=new ArrayList<Integer>();
		l.add(120);
		l.add(11);l.add(36);l.add(37);l.add(10);
		l.add(21);l.add(36);l.add(37);l.add(10);l.add(53);l.add(53);l.add(52);l.add(58);
		l.add(59);
		System.out.println(l);
		List<Integer> l2=l.stream().filter((i)->i%2==0).map((i)->i+10000).collect(Collectors.toList());
		//l.stream().filter((i)->i%2==0).map((i)->i+10000);
		
		//System.out.println(l2);
		System.out.println(l);
		l.forEach((s)->System.out.print(s+" "));
		System.out.println();
		long odds=l.stream().count();
		System.out.println("Count of Odds No: "+l.stream().filter(i->i%2==1).count());
		System.out.println("Count of  Evwn No: "+l.stream().filter(i->i%2==0).count());
		System.out.println("Count of  All No: "+l.stream().count());
		
		List<Integer> l3=l.stream().sorted().collect(Collectors.toList());
		System.out.println(l3);
		//System.out.println("Sotred List "+ l.stream().sorted());
		List<Integer> l4=l.stream().sorted((i1,i2)->i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println(l4);
		System.out.println("MIN : "+l.stream().min((i1,i2)->i1.compareTo(i2)).get());
		System.out.println("MAX : "+l.stream().max((i1,i2)->i1.compareTo(i2)).get());
		System.out.println("MIN in Descending Order : "+l.stream().min((i1,i2)->-i1.compareTo(i2)).get());
		System.out.println("MAX in Descending Order : "+l.stream().max((i1,i2)->-i1.compareTo(i2)).get());
		Integer a[]=l.stream().toArray(Integer[]::new);
		for(Integer i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println(" ");
		Stream.of(a).forEach(System.out::println);// converting array to stream and printing it
	}

}
