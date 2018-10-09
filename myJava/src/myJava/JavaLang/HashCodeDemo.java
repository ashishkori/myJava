package myJava.JavaLang;

public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HashCode Example");//Student1 is OverRidden object class method Class
		Student s=new Student(6, "Ashish");
		Student1 s1=new Student1(6, "Ashish");
		System.out.println(s.hashCode());
		System.out.println(s);
		System.out.println(s1);

	}

}

