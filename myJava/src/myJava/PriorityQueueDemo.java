import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue p=new PriorityQueue(20,new my());
		TreeSet t=new TreeSet(new my());
		//Collection s=new Collection();
		System.out.println(p.peek());
		//System.out.println(p.element());//run time exception NoSuchElementException
		System.out.println(p.poll());
		//System.out.println(p.remove());//run time exception NoSuchElementException
		for(int i=0;i<=25;i++)
		{
			p.offer(i);
			t.add(i+50);
		}
		System.out.println(p);
		System.out.println(t);
		p.poll();
		p.poll();
		p.poll();
		//System.out.println(p.poll()); System.out.println(p.poll());
		System.out.println(p);
		PriorityQueue p1=new PriorityQueue(t);
		System.out.println(p1);;

		
	}

}
class my implements Comparator{
	public int compare(Object obj1, Object obj2)
	{
		Integer i1=(Integer)obj1;
		Integer i2=(Integer)obj2;
		//return -i1.compareTo(i2);
		if(i1>i2)
			return -1;
		else if(i1<i2)
			return +1;
		else
			return 0;
	}
}