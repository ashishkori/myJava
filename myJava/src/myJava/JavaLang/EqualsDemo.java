package myJava.JavaLang;

public class EqualsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Equals Example Object Method Call");
		//System.out.println("Equals Example");
		Student s=new Student(6, "Ashish");
		Student s1=new Student(8, "Amit");
		Student s2=new Student(6, "Ashish");
		Student s3=new Student(25, "Ashish");
		//Student s4=s1;
		//Student1 s1=new Student1(6, "Ashish");
		System.out.println(s.equals(s1));
		System.out.println(s.equals(s2));
		System.out.println(s.equals(s3));
		//System.out.println(s1.equals(s4));
		Student1 st=new Student1(6, "Ashish");
		Student1 st1=new Student1(8, "Amit");
		Student1 st2=new Student1(6, "Ashish");
		Student1 st3=new Student1(25, "Ashish");
		//Student s4=s1;
		System.out.println("Equals Example Overridden Method Call");
		System.out.println(st.equals(st1));
		System.out.println(st.equals(st2));
		System.out.println(st.equals(st3));
		//System.out.println(s1.equals(s4));

	}

}
