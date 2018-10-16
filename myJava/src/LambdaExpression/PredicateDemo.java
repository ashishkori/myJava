package LambdaExpression;

import java.util.*;
import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Predicate<Integer> p1=(I)->I%2==0;
		System.out.println(p1.test(10));
		System.out.println(p1.test(11));
		Predicate<String> s=(S)->S.length()>5;
		Predicate<String> o=(S)->S.length()%2==0;
		String st[]= {"Ashi","Ashish","Kumar", "fasf","gsh","Ashish kumar", "Aman kumar", "Dinesh","mahesh"};
		System.out.println(s.test("Ashish"));
		System.out.println(s.test("Ashi"));
		//System.out.println(st);
		for(String x:st)
		{
			if(s.test(x))
				System.out.print(x+" ");
		}
		System.out.println();
		for(String x:st)
		{
			if(o.test(x))
				System.out.print(x+" ");
		}
		System.out.println();
		ArrayList<Employee1> l=new ArrayList<Employee1>();
		//ArrayList<Employee> l=new ArrayList<Employee>();
		l.add(new Employee1("Ashish",10000));
		l.add(new Employee1("Amit",1216));
		l.add(new Employee1("Aman",1009));
		l.add(new Employee1("Binny",1014));
		l.add(new Employee1("Cinny",5002));
		l.add(new Employee1("Ginny",7502));
		l.add(new Employee1("Durga",12320));
		System.out.println(l);
		Predicate<Employee1> e=(emp)->emp.name.length()>4 & emp.salary>1200;
		for(Employee1 e1:l)
		{
			if(e.test(e1))
			{
				System.out.println(e1);
			}
		}
	}

}
class Employee1
{
	String name;
	int salary;
	
	public Employee1(String name, int salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public Employee1() {
		super();
		
	}
	@Override
	public String toString() {
		return "Employee1 [name=" + name + ", salary=" + salary + "]";
	}
}

