package InnerClass;

public class InnerClassNesting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a=new A();
		A.B b=a.new B();
		A.B.C c=b.new C();
		c.mc();//first method
		new A().new B().new C().mc();//second method

	}

}
class A
{
	class B
	{
		class C
		{
			public void mc()
			{
				System.out.println("Nesting Of Inner Class");
			}
		}
	}
	
	
}