
package myJava.JavaLang;

import java.lang.reflect.Method;

public class GetClassDemo {
	public static void main(String args[])
	{
		int count=0;
		String s=new String("ashish");
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
