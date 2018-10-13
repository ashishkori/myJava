package InnerClass;

public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----Accessing Static Nested method from Diffrent Class---");
		
		Nested.Inner n=new Nested.Inner();
		n.m1(); 
		//Inner.m1()
		Nested n1=new Nested();
		n1.m2();
		

	}

}
class Nested
{
	static class Inner{
		public static void m1()
		{
			System.out.println("Static Nested method");
		}
	}
	public static void m2()
	{
		System.out.println("-----Accessing Static Nested method from Same Class---");
		Inner i=new Inner();
		i.m1();
	}
	}