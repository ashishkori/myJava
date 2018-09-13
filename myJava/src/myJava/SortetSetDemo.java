package myJava;
import java.util.*;
import java.util.Random;
public class SortetSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random(10);
		TreeSet t=new TreeSet();
		HashSet h=new HashSet();
		ArrayList a=new ArrayList();
		//t.add(null);
		//SortedSet s=new TreeSet();
		for(int i=0;i<200;i++)
		{
			int x=r.nextInt()/100000000;
			t.add(x);
			h.add(x);
			a.add(x);
			
		}
		System.out.println(t);
		System.out.println(h);
		System.out.println(a);
		

	}

}
