package myJava;
import java.util.*;

public class CuesorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		for(int i=0;i<50;i++)
		{
			v.addElement(i);
		}
		v.add(11);
		Enumeration e=v.elements();
		while(e.hasMoreElements())
		{
			Integer x=(Integer)e.nextElement();
			if(x%2==0)
				System.out.print(x+" ");
			
		}
		System.out.println();
		
		System.out.println(v);
		
		Iterator itr=v.iterator();
		while(itr.hasNext())
		{
			Integer x=(Integer)itr.next();
			System.out.print(x +" ");
			if(x%2 !=0)
				itr.remove();
			
		}
		System.out.println();
		System.out.println(v);
	}

}
