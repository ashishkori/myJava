package myJava.OOPs;

public class InstaceControlFlowDemo {

	 int i=10;
	 {
		m1();
		System.out.println("First Instance Block");
	}
	 InstaceControlFlowDemo()
	 {
		 System.out.println("Constructor");
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InstaceControlFlowDemo i=new InstaceControlFlowDemo();
		//InstaceControlFlowDemo i2=new InstaceControlFlowDemo();
		System.out.println("Main Block");

	}
	 void m1()
	{
		System.out.println(j);
	}
	 {
		
		System.out.println("Second Instance Block");
	}
	 int j=20;
}
