package myJava;

public class InterningString {
	public static void main(String[] args) {
	String s1=new String("Ashish");
	String s2=s1.intern();
	System.out.println(s1==s2);
	String s3="Ashish";
	System.out.println(s3==s2);
	}
}
