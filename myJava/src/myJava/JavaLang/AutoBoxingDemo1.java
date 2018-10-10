package myJava.JavaLang;

public class AutoBoxingDemo1 {

	static Integer I=0; //No Error runs fine
	//static Integer I; //java.lang.NullPointerExceptionat myJava
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=I;
		System.out.println(m);
	}

}
