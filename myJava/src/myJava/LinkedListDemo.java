package myJava;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list=new LinkedList();
		list.add("ashish");
		list.add(null);
		list.addFirst("Mr.");
		list.addLast("Kori");
		ArrayList list2=new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		list.addAll(1,list2);
		System.out.println(list.toString());
		System.out.println(list2.toString());

	}

}
