package myJava.JavaLang;

public class WideningVsVarArg {

	public static void m1(int ... i)
	{
		System.out.println("Var-arg");
	}
	public static void m1(long l)
	{
		System.out.println("Widening");
	}
	public static void main(String[] args) {
		
		System.out.println("Widening Vs Var-Arg ");
		System.out.println("Widening Wins the race  ");
		int x=10;
		m1(x); 

	}

}
