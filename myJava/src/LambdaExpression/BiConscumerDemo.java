package LambdaExpression;

import java.util.ArrayList;
import java.util.function.BiConsumer;

public class BiConscumerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiConsumer<Emp, Integer>bc=(e,i)->e.eno=e.eno+i;
		ArrayList<Emp> l=new ArrayList<Emp>();
		l.add(new Emp(1,"Ashisk"));
		l.add(new Emp(23,"Sunney"));
		l.add(new Emp(12,"Bunney"));
		l.add(new Emp(51,"Kesav"));
		l.add(new Emp(10,"Shmeer"));
		for(Emp E:l)
		{
			System.out.print(E.eno+"--"+E.name+" ");
		}
		System.out.println();
		for(Emp E:l)
		{
			bc.accept(E,200);
		}
		for(Emp E:l)
		{
			System.out.print(E.eno+"--"+E.name+" ");
		}
		System.out.println();
				
	}

}
