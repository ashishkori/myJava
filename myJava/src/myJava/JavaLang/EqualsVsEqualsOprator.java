package myJava.JavaLang;

public class EqualsVsEqualsOprator {
	public static void main(String args[])
	{
		String s1=new String("Ashish");
		String s2=new String("Ashish");
		StringBuffer sb1=new StringBuffer("Ashish");
		StringBuffer sb2=new StringBuffer("Ashish");
		System.out.println(s1==s2); //false
		System.out.println(s1.equals(s2)); //true
		System.out.println(sb1==sb2); //false
		System.out.println(sb1.equals(sb2)); //false StringBuffer class doesn't Override .equals() Method
		//System.out.println(s1==sb2);//CE: Incompatible operand types String and StringBuffer

		System.out.println(s1.equals(sb2)); //false
		System.out.println("Similarity of .equals() and ==");//false		
		System.out.println(s1.equals(null));//false
		System.out.println(s1==null);//false
	}
	

}
