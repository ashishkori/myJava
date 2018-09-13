package myJava;
import java.util.*;
public class collection2 {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		 ArrayList <Integer> list= new ArrayList<Integer>();
		int n=scan.nextInt();
		while(n-->0)
		{
			list.add(scan.nextInt());
		}
		//st.put();
		// Iterator<string> iterator = collection.iterator();
		Iterator<Integer> itr= list.iterator();
		while(itr.hasNext())
		{
			System.out.print(itr.next()+" ");
		}
		String s1="Ashish";
		String s2="Ashish";
		String s3=new String("Ashish");
		System.out.println(s1==s2);
		System.out.println(s3==s2);
		System.out.println(s1.equals(s2));
		s2="Kumar";
		System.out.println(s1==s2);
		System.out.println(s1+" "+s2);
		System.out.println(s1.equals(s3));
	}

}
