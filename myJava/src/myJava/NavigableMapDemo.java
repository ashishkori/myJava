package myJava;
import java.util.*;

import java.util.TreeSet;

public class NavigableMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(100,"A");
		t.put(10,"B");
		t.put(200,"C");
		t.put(500,"D");
		t.put(50,"E");
		t.put(120,"F");
		t.put(1000,"G");
		System.out.println("TreeMap: "+ t);
		System.out.println("FirstHey: "+t.firstKey());
		System.out.println("LastKey :"+t.lastKey());
		System.out.println("FloorKey 100 :"+t.floorKey(100));
		System.out.println("LowerKey 100 :" +t.lowerKey(100));
		System.out.println("CeilingKey 250 :"+t.ceilingKey(250));
		System.out.println("HigherKey 250 : "+t.higherKey(250));
		System.out.println("pollFirstEntry :  "+t.pollFirstEntry());
		System.out.println("TreeMap:" +t);
		System.out.println("pollLastEntry :"+t.pollLastEntry());
		System.out.println("TreeMap: "+t);
		System.out.println("DescendingMap :"+t.descendingMap());
		

	}




}
