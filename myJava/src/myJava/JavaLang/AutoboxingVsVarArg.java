package myJava.JavaLang;

public class AutoboxingVsVarArg {


	public static void m1(int ... i)
	{
		System.out.println("Var-arg");
	}
	public static void m1(Integer I)
	{
		System.out.println("AutoBoxing");
	}
	public static void main(String[] args) {
		
		System.out.println("AutoBoxing Vs Var-Arg ");
		System.out.println("AutoBoxing Wins the race  ");
		int x=10;
		m1(x); //Var-Arg method have least priority.
		

	}

}
