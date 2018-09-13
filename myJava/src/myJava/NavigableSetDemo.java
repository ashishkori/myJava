package myJava;
import java.util.*;

public class NavigableSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Integer> t=new TreeSet<Integer>();
		t.add(100);
		t.add(200);
		t.add(10);
		t.add(2610);
		t.add(2300);
		t.add(250);
		t.add(120);
		t.add(10010);
		System.out.println("TreeSet: "+ t);
		System.out.println("First: "+t.first());
		System.out.println("Last: "+t.last());
		System.out.println("Floor 100 :"+t.floor(100));
		System.out.println("Lower 100 :" +t.lower(100));
		System.out.println("Ceiling 250 :"+t.ceiling(250));
		System.out.println("Higher 250 :"+t.higher(250));
		System.out.println("pollFirst :"+t.pollFirst());
		System.out.println("TreeSet:" +t);
		System.out.println("pollLast :"+t.pollLast());
		System.out.println("TreeSet: "+t);
		System.out.println("DescendingSet :"+t.descendingSet());
		

	}

}
