package ConcurrentCollection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.*;
public class CuncurrentHashmapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer, String> m=new ConcurrentHashMap<Integer,String>();
		m.put(102, "Ashish");
		m.put(103, "Amit");
		m.put(104, "Pawan");
		m.put(105, "Ponna");
		m.put(106, "Sunil");
		m.put(107, "Durga");
		m.put(108, "Manshi");
		m.put(109, "Amola");
		m.putIfAbsent(109, "Ashish");
		m.put(111, "Dinesh");
		m.put(112, "Pintu");
		System.out.println(m);
		HashMap<Integer, String> m1=new HashMap<Integer, String>();
		m1.put(102, "Ashish");
		m1.put(103, "Amit");
		m1.put(104, "Pawan");
		m1.put(105, "Ponna");
		m1.put(106, "Sunil");
		m1.put(107, "Durga");
		m1.put(108, "Manshi");
		m1.put(109, "Amola");
		m1.putIfAbsent(109, "Ashish");
		m1.put(111, "Dinesh");
		m1.put(112, "Pintu");
		System.out.println(m1);
		ConcurrentHashMap chm1=new ConcurrentHashMap(m1);
		System.out.println(chm1);
		Runnable r=()->{
			try {
				Thread.sleep(500);
			} 
			catch (InterruptedException e){};
			System.out.println("Updating MAP");
			chm1.put(116, "Nanda");
			chm1.put(117, "Suresh");
		};
		Thread t=new Thread(r);
		t.start();
		Set s=chm1.keySet();
		Iterator itr=(s).iterator();
		while(itr.hasNext())
		{
			Integer i=(Integer)itr.next();
			System.out.println("Main Thread Current Entry is: "+i +":"+ chm1.get(i) );
			try { 
				Thread.sleep(500);
			} catch(InterruptedException e) {};
			
		}
	}

}
