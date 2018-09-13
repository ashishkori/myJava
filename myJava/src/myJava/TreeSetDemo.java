import java.util.*;
import java.util.Random;
public class TreeSetDemo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random r=new Random(100000);
		TreeSet<Integer> t1=new TreeSet<Integer>();
		TreeSet<Integer> t=new TreeSet<Integer>(new myComparatorDup());
		for(int i=0;i<200;i++)
		{
			int x=r.nextInt()/100000000;
			t.add(x);
			t1.add(x);
			
		}
		System.out.println(t);
		System.out.println(t1);
		

	}

}
class myComparator implements Comparator
	{
		public int compare(Object obj1, Object obj2 )
		{
			Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
			if(i1<i2)
				return 1;
			else if(i1>i2)
				return -1;
			else return 0;
			}
	}
class myComparatorDec implements Comparator
	{
		public int compare(Object obj1, Object obj2 )
		{
			Integer i1=(Integer)obj1;
			Integer i2=(Integer)obj2;
			return -i1.compareTo(i2);
			}
	}
class myComparatorDup implements Comparator
{
	public int compare(Object obj1, Object obj2 )
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		return 1;
		}
}
