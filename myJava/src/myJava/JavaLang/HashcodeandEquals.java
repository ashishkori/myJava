package myJava.JavaLang;

public class HashcodeandEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Ashish");
		String s2=new String("Ashish");
		StringBuffer sb1=new StringBuffer("Ashish");
		StringBuffer sb2=new StringBuffer("Ashish");
		System.out.println("HashCose() and equals() on String");
		System.out.println(s1.equals(s2)); 
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s1.hashCode()==s2.hashCode());//true as equals method is giving true
		
		System.out.println("HashCose() and equals() on StringBuffer"); 
		System.out.println(sb1.equals(sb2)); 
		System.out.println(sb1.hashCode());
		System.out.println(sb2.hashCode());
		System.out.println(sb1.hashCode()==sb2.hashCode());//false as equals method is giving false
		
		
	}

}
