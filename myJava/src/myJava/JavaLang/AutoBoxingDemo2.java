package myJava.JavaLang;

public class AutoBoxingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer x=10;
		Integer y=x;
		x++;
		System.out.println(x);
		System.out.println(y);
		System.out.println(x==y);//All Wrapper class objects are immutable
	}

}
