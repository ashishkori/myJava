package myJava;

public class InterningStringDemo1 {
	public static void main(String[] args) {
		String s1=new String("Ashish");
		String s2=s1.concat(" Kumar");
		//System.out.println(s1==s2);
		String s3=s2.intern();
		System.out.println(s2==s3);
		String s4="Ashish Kumar";
		System.out.println(s2==s4);
		}
}
