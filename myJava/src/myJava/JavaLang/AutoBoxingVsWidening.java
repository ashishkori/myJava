package myJava.JavaLang;

public class AutoBoxingVsWidening {

	public static void m1(Integer I)
	{
		System.out.println("AutoBoxing");
	}
	public static void m1(long l)
	{
		System.out.println("Widening");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Autoboxing Vs Widening");
		System.out.println("Widening Wins the race  ");
		int x=10;
		m1(x); //Widning as as it came in 1.0V where Autoboxing came in  1.5V
		

	}

}
