package myJava;
import java.util.*;
public class TreeMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeMap t=new TreeMap();
		TreeMap t1=new TreeMap(new MyComparator());
		t.put(100,"ZZZZ");
		t.put(10,"ZZZZ10");
		t.put(102,"YYYY");
		t.put(20,"AAAA");
		t1.put(100,"ZZZZ");
		t1.put(10,"ZZZZ10");
		t1.put(102,"YYYY");
		t1.put(20,"AAAA");
		System.out.println(t);
		System.out.println(t1);
		
	}

}
class MyComparator implements Comparator{
	public int compare(Object obj1,Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return -i1.compareTo(i2);
	}
	
}
