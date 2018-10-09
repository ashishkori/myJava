
package myJava.JavaLang;

import java.lang.reflect.Method;

public class GetClassDemo {
	public static void main(String args[])
	{
		int count=0;
		Student1 s=new Student1(25,"ashish");
		Class c=s.getClass();
		Method[] m=c.getDeclaredMethods();
		System.out.println("Declared Method");
		for(Method m1:m)
		{
			count++;
			System.out.println(m1.getName());
		}
		
		System.out.println("Total Method in "+ c.getName()+" is "+ count);
		System.out.println("Total Method in "+ c.getSimpleName()+" is "+ count);
	}
}
