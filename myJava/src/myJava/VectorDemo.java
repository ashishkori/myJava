package myJava;
import java.util.*;
public class VectorDemo {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v=new Vector();
		System.out.println(v.capacity());
		for(int i=1;i<40;i++)
		{
			v.addElement(i);
		}
		System.out.println(v.capacity());
		v.add(5,111);
		System.out.println(v.size());
		System.out.println(v.capacity());
		v.removeElementAt(1);
		System.out.println(v);
		System.out.println(v.firstElement());
		System.out.println(v.lastElement());
		
		for(int i=1;i<20;i++)
		{
			v.removeElement(i);
		}
		System.out.println(v.capacity());
	}

}
