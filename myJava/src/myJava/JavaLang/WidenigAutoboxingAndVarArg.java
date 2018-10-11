package myJava.JavaLang;

public class WidenigAutoboxingAndVarArg {

	public static void m1(int ... i)
	{
		System.out.println("Var-arg");
	}
	public static void m1(Integer I)
	{
		System.out.println("AutoBoxing");
	}
	public static void m1(long l)
	{
		System.out.println("Widening");
	}
	public static void main(String[] args) {
		
		System.out.println("AutoBoxing Vs Var-Arg Vs Widening");
		//System.out.println("AutoBoxing Wins the race  ");
		int x=10;
		m1(x); //Widening.
		
		

	}

}
