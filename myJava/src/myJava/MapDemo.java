package myJava;
import java.util.*;
//import java.util.Map.Entry;
public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap m=new HashMap();
		HashMap m1=new HashMap();
		//m.put("102"," Ashish");
		m.put(12, "Kumar");
		
		//m.put(null, "kori");
		m.put(25, "2015");
		m1.put("1021"," Ashish");
		m.put(0012, "Kumar");
		
		//m1.put(null, "Amit kori");
		m.put(2500, "2015");
		System.out.println(m);
		System.out.println(m.put(5466556, "Ashish kumar kori"));
		System.out.println(m.put(5466556, "Ashish kumar"));
		m.putAll(m1);
		System.out.println(m);
		Set s=m.keySet();
		System.out.println("Keys : " + s);
		Collection s2=m.values();
		System.out.println("Values : "+s2);
		System.out.println("Keys : "+s);
		Set s3=m.entrySet();
		System.out.println("Entry Sets : "+s3);
		Iterator itr= s3.iterator();
		System.out.println(s3);
		while(itr.hasNext())
		{
			Map.Entry e=(Map.Entry)itr.next();
			System.out.print(e.getKey()+"----"+e.getValue()+" ");
			if(e.getKey().equals(2500))
			{
				e.setValue("Ajit Kumar");
			}
		}
		System.out.println();
		
		//m.put(1254,"we4tweqytqetyehywsysweywetq");
		System.out.println(m);
		//Entry e=m.entry();
		
		
		
		

	}

}
