package myJava;
import java.util.Arrays;
import java.util.*;

public class ArraysDemo {

	public static void main(String... args) {
		// TODO Auto-generated method stub
		int a[]= {25,20,10,3,25,956,36,26,99,600};
		String s[]= {"Z ","X","A ","Y ","b ","a ","s ","S ","t ","u ","W ","Y ","z ","D "};
		System.out.println("Premitive Before Sorting: ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(a);
		System.out.println("Premitive After Sorting  ");
		for(int i:a)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		
		System.out.println("Object Array Before Sorting: ");
		for(String i:s)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(s);
		System.out.println("Object Array  After Sorting  ");
		for(String i:s)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		Arrays.sort(s,new My());
		System.out.println("Object Array After Customize Sorting  ");
		for(String i:s)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("NOTE Arrays.binarysearch() method is same as Collections.binarySearch() method\r\n ");
		/* ############################################################################
		
		NOTE Arrays.binarysearch() method is same as Collections.binarySearch() method
		######################################################################
	*/
	}

}
class My implements Comparator
{
	public int compare(Object o1, Object o2)
	{
		String s1=(String)o1;
		String s2=(String)o2;
		return s2.compareTo(s1);
	}
}
