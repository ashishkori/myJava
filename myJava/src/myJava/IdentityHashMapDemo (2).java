import java.util.*;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
	HashMap m1=new HashMap();
	temp t=new temp();
	temp t2=new temp();
	WeakHashMap w=new WeakHashMap(); //week hashmap
	IdentityHashMap m=new IdentityHashMap();
	Integer i1=new Integer(10); 
	Integer i2=new Integer(10); 
	Integer i3=new Integer(10); 
	System.out.println(i1==i2);
	System.out.println(i1.equals(i2));
	//i1.equals(i2);
	m.put(i1, 10252);
	m.put(i2, "I2");
	m.put(i3, "I3");
	m.put(t2,"Kumar");
	m1.put(i1, 10252);
	m1.put(i2, "I2");
	m1.put(i3, "I3");
	//i3=null;
	System.out.println(m);
	System.out.println(m1);
	w.put(t, "Ashish");
	System.out.println("weakhashmap ="  +w);
	t=null;
	t2=null;
	System.gc();
	//Thread.sleep(5000);
	System.out.println("weakhashmap ="  +w);
	}	
}
class temp{
	public String toString()
	{
		return "temp";
	}
	public void finalize()
	{
		System.out.println("Finalize method call");
	}
}