package myJava;

public class StringConstantPool {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1=new String("You can not change me");
		String s2=new String("You can not change me");
		System.out.println(s1==s2);//false
		String s3="You can not change me";
		String s4="You can not change me";
		System.out.println(s3==s4);//true
		System.out.println(s1==s3);//false
		String s5="You can not "+ "change me";//Performed at compile time because both are Compile time Constant
		System.out.println(s3==s5);//true
		String s6="You can not";
		String s7=s6+" change me";//Performed at Runtime  because at least one is normal variable
		System.out.println(s7==s1);//false
		System.out.println(s1.equals(s7));//true
		final String s8="You can not";
		String s9=s8+" change me"; //Performed at compile time because both are Compile time Constant
		System.out.println(s3==s9);//true
		System.out.println(s6==s8);//true
	}

}
