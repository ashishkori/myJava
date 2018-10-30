package LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> l=new ArrayList<String>();
		l.add("Ashish Kumar");
		l.add("Rajesh Kumar");l.add("Amit Kumar");l.add("Pawan");l.add("Shubham");
		l.add("Sunney");l.add("Mamta");l.add("Mallika");l.add("Neha");
		List<String> l2=l.stream().sorted().collect(Collectors.toList());
		System.out.println(l2);
		List<String> l3=l.stream().sorted((s1,s2)->s2.compareTo(s1)).collect(Collectors.toList());
		System.out.println(l3);
		List<String> l4=l.stream().sorted((s1,s2)->{if(s1.length()>s2.length()) return 1; else if(s1.length()==s2.length() )return s1.compareTo(s2); else return -1;}).collect(Collectors.toList());
		System.out.println(l4);
		String min=l.stream().min((s1,s2)->s2.compareTo(s1)).get();
		System.out.println("Min: "+min);
		l4.stream().forEach(System.out::println);
		l4.stream().forEach(i->System.out.println(i));//equivalent to l4.stream().forEach(System.out::println);
	
	}

}
