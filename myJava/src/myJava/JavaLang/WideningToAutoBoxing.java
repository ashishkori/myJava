package myJava.JavaLang;

public class WideningToAutoBoxing {

	public static void m1(Long L)
	{
		System.out.println("Vailid ");
	}
	public static void main(String[] args) {
		
		System.out.println("Widening followed by Autoboxing Not Allowed in Java");
		//System.out.println("AutoBoxing Wins the race  ");
		int x=10;
		m1(x); //CE:is not applicable for the arguments (int)
		m1(155l);// Vailid

	}

}
