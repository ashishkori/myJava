package myJava.JavaLang;

public class ToStringDemo {
	public static void main(String args[])
	{
		Student s=new Student(10,"Ashish");
		//Student s1=new Student(20,"Amit");
		System.out.println(s);
		System.out.println(s.toString());
		//System.out.println(s1);
		Student1 s10=new Student1(10,"Ashish");
		
		System.out.println(s10.toString());
		System.out.println(s10);
		
	}
}
