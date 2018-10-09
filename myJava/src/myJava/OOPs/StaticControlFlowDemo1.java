package myJava.OOPs;

public class StaticControlFlowDemo1 {
	static int i=10;
	static {
		m1();
		System.out.println("First Static Block");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		m1();
		System.out.println("Main Block");

	}
	static void m1()
	{
		System.out.println(j);
	}
	static {
		
		System.out.println("Second Static Block");
	}
	static int j=20;
}
