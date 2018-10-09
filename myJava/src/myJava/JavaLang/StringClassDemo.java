package myJava.JavaLang;

public class StringClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub+
		System.out.println("Example: 1 : Case 1");
		String s=new String("Ashish");
		StringBuffer sb=new StringBuffer("Ashish");
		s.concat(" Kumar");
		sb.append(" Kumar");
		System.out.println(s);
		System.out.println(sb);
		//##################################################
		System.out.println("Example: 2 : Case 2");
		String s1=new String("ashish");
		//String s2=new String("Ashish");
		StringBuffer sb1=new StringBuffer("ashish");
		//StringBuffer sb2=new StringBuffer("Ashish");
		System.out.println(s1==s);
		System.out.println(s1.equals(s));
		System.out.println(sb1==sb);
		System.out.println(sb1.equals(sb));
		System.out.println("Example: 3 : Case 3");
		String s2=s1.toUpperCase();
		String s3=s1.toLowerCase();//no New object created current object in not changing
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		
		System.out.println("Example: 4 : Very Importent");
		String s4=s2.toUpperCase();
		//String s3=s1.toLowerCase();
		System.out.println(s1==s4); // new Object created current object is changed
		//System.out.println(s1==s3);
		s2=s2.toLowerCase();
		System.out.println("Example: 5 Very Importent");
		s2=s2.toLowerCase();
		String s5=s2.toString();
		String s6=s2.toLowerCase();
		String s7=s2.toUpperCase();
		String s8=s4.toLowerCase();
		System.out.println(s5==s2); //No change in Object at runtime  so no new Object Created
		System.out.println(s6==s2); //No change in Object at runtime so no new Object Created
		System.out.println(s7==s2); //Change in Object at run time So change in Object is Created
		System.out.println(s8==s2); //Change in Object at run time So change in Object is Created
		System.out.println(s8==s4); //Change in Object at run time So change in Object is Created
		
	}

}
