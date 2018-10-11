package myJava.JavaLang;

public class AutoBoxingToWiding {

	public static void m1(Object o)
	{
		System.out.println("Object");
	}
	public static void main(String[] args) {
		
		System.out.println("Autoboxing followed by Widening");
		//System.out.println("AutoBoxing Wins the race  ");
		int x=10;
		m1(x); 
		Number n=10;
		m1(n);
	}

}
