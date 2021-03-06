package myJava;
import java.util.*;
public class CollectionListSortingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList l=new ArrayList();
		ArrayList l1=new ArrayList();
		l.add("Ashish");

		l.add("Kumar");

		l.add("Kori");
		l.add("-0");
		l.add("0");
		l.add("Amit");
		l.add("A");
		l.add("Kumar");
		l.add("Y");
		l.add("0123");
		l.add("X");
		l.add("123");
		l.add("Z");
		l.add("9999");
		l.add("Ajeet");
		l.add("-5558");
		l.add("Ashish");
		System.out.println("Search before sorting X, even though X is there in list(Gives Unpredictable Result) :"+Collections.binarySearch(l,"X"));
		
		l.add("-5558");
		System.out.println("Unsorted List: "+ l);
		
		Collections.sort(l);
		System.out.println("Search x "+Collections.binarySearch(l,"x"));
		System.out.println("Search X "+Collections.binarySearch(l,"X"));
		System.out.println("D.N.Sorted List: "+ l);
		Collections.sort(l,new My());
		System.out.println("Descending Sorted List: "+ l);
		System.out.println("Search x "+Collections.binarySearch(l,"x",new My()));
		System.out.println("Search X without Comparator object gives unpredictable Result:  "+Collections.binarySearch(l,"X"));
		System.out.println("Search X "+Collections.binarySearch(l,"X",new My()));
		// Collections Reverse
		System.out.println("Before Reverse"+ l);
		Collections.reverse(l);
		System.out.println("After Reverse method "+ l);
		
		
				
		

	}

}
class My implements Comparator{
	public int compare(Object obj1, Object obj2)
	{
		String s1=(String)obj1;
		String s2 =(String)obj2;
		return -s1.compareTo(s2);
	}
}