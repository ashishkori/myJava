package myJava;
import java.util.*;

public class LinkedHashMapDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap m=new LinkedHashMap();
		HashMap m1=new HashMap();
		m.put("102"," Ashish");
		m.put(12, "Kumar");
		m.put(null, "kori");
		m.put(25, "2015");
		m.put("1021"," Ashish");
		m.put(0012, "Kumar");
		
		m.put(null, "Amit kori");
		m.put(2500, "2015");
		m1.put(12, "Kumar");
		m1.put(null, "kori");
		m1.put(25, "2015");
		m1.put("1021"," Ashish");
		m1.put(0012, "Kumar");
		
		m1.put(null, "Amit kori");
		m.put(2500, "2015");
		System.out.println(m);
		
		m.putAll(m1);
		System.out.println(m1);
		System.out.println(m);
		Set s3=m.entrySet();
		
		Iterator itr= s3.iterator();
		//System.out.println(s3);
		
		
		m.put(1254,"we4tweqytqetyehywsysweywetq");
		System.out.println(m);
		//Entry e=m.entry();
		
		
		
		

	}

}
