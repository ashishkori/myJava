package myJava;
import java.util.*;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Constructor fo HashSet
		HashSet hash=new HashSet();
		HashSet hash1=new HashSet(20);//initial capacity default load factor .75
		//HashSet hash2=new HashSet(20,0.80);//initial capacity and load factor .80
		//HashSet hash1=new HashSet(Collection );//initial capacity
		LinkedHashSet lhash=new LinkedHashSet();
		for(int i=0;i<20;i++)
		{
			if(i%2==0)
			hash.add(i);
			else
			hash1.add(i);
			//hash2.add(i);
			
		}
		lhash.add(null);
		for(int i=20;i>0;i++)
		{
			lhash.add(i);
			
		}
		lhash.add(null);
		HashSet hash2=new HashSet(hash);
		hash2.add(hash1);
		hash.add("ashish");
		hash1.add("ashish");
		hash2.add("ashish");
		hash.add(null);
		hash1.add(null);
		hash2.add(null);
		System.out.println(hash);
		System.out.println(hash1);
		System.out.println(hash2);
		System.out.println(lhash);
	}

}
