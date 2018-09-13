package myJava;
import java.util.*;
import java.util.Random;
public class TreeSetDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random(100000);
		TreeSet t1=new TreeSet(new myComp());
		TreeSet t=new TreeSet();
		
			t.add("Ashish");
			t1.add("Ashish");
			t.add("Kumar");
			t1.add("Kumar");
			t.add("Kori");
			t1.add("Kori");
			t.add("Amit");
			t1.add("Amit");
			t.add("ashish");
			t1.add("ashish");
			t.add("Arsh");
			t1.add("Arsh");
			
			
		
		System.out.println(t);
		System.out.println(t1);
		

	}

}
class myComp implements Comparator
	{
		public int compare(Object obj1, Object obj2 )
		{
			String i1=(String)obj1;
			String i2=(String)obj2;
			return i2.compareTo(i1);
			}
	}