package LambdaExpression;
import java.util.*;
public class InnerClassLambda {
	public static void main(String ... args)
	{
		ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee("Ashish",1212));
		l.add(new Employee("Amit",1216));
		l.add(new Employee("Aman",1219));
		l.add(new Employee("Binny",1312));
		l.add(new Employee("Cinny",1612));
		l.add(new Employee("Ginny",1202));
		l.add(new Employee("Durga",1232));
		System.out.println(l);
		Comparator<Employee> c=(e1,e2)->{
					return (e2.name).compareTo(e1.name);
				};// Lambda Expression for comparator Interface
		Collections.sort(l, c);
		System.out.println(l);
	}
}
class Employee
{
	String name;
	int emp;
	Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String name, int emp) {
		super();
		this.name = name;
		this.emp = emp;
	}
	@Override
	public String toString() {
		return emp+":"+ name +" ";
	}
	
	
}