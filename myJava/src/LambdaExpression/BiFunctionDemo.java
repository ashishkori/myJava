package LambdaExpression;

import java.util.ArrayList;
import java.util.function.BiFunction;

public class BiFunctionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer,String,Emp> bf=(i,s)->new Emp(i,s); 
		ArrayList<Emp> l=new ArrayList<Emp>();
		l.add(bf.apply(1, "Ashish"));
		l.add(bf.apply(11, "Amit"));
		l.add(bf.apply(3, "Sameer"));
		l.add(bf.apply(5, "Pawan"));
		l.add(bf.apply(16, "Ravi"));
		System.out.println(l);
	}

}
class Emp
{
	int eno;
	String name;
	//double Salary=0;
	public Emp(int eno, String name) {
		super();
		this.eno = eno;
		this.name = name;
	}
	@Override
	public String toString() {
		return eno + " : " + name;
	}
	
	
}