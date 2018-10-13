package InnerClass;

public class StaticNestedClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Nested.Inner n=new Nested.Inner();
		n.m1(); 

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
	}