package myJava;
import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList list=new ArrayList();
		list.add("Ashish");
		list.add("Amit");
		list.add("Ajeet");
		list.add("Arsh");
		list.add("shree");
		System.out.println(list);
		ListIterator ltr=list.listIterator();
		
		while(ltr.hasNext())
		{
			String s=(String)ltr.next();
			if(s.equals("Ashish") || s.equals("Amit"))
			{
				ltr.add("Kumar");
			}
			if(s.equals("Arsh"))
					{
				ltr.set("Arsh kori");
				ltr.add("Parvati");
					}
			if(s.equals("shree"))
			{
				ltr.remove();
				ltr.add("Shobha");
			}
		}
		System.out.println(list.toString());

	}

}
