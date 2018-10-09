package myJava.JavaLang;

public class Interview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Ashish");
		String s2=new String("Ashish");
		StringBuffer sb1=new StringBuffer("Ashish");
		StringBuffer sb2=new StringBuffer("Ashish");
		StringBuilder Sb1=new StringBuilder("Ashish");
		StringBuilder Sb2=new StringBuilder("Ashish");
		System.out.println("For String Class");
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println("For String Buffer Class");
		System.out.println(sb1==sb2);
		System.out.println(sb1.equals(sb2));
		System.out.println("For String Builder Class");
		System.out.println(Sb1==Sb2);
		System.out.println(Sb1.equals(Sb2));
		System.out.println(sb1.getClass());
		Class c=s1.getClass();
		System.out.println(c);

	}

}
