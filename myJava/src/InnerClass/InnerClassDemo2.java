package InnerClass;

public class InnerClassDemo2 {
	public static void main(String args[])
	{
/*		System.out.println("Outer Class");
		Outer O=new Outer();
		Outer.Inner I=O.new Inner();
		I.m1();
*/
		new Outer().new Inner().m1();

	}
}
class Outer{
	static int x=10000;
	int y=20;
	class Inner{
		int x=999;
		public void m1()
		{
			int x=5;
			System.out.println("Inner Class Method");
			System.out.println("X :"+x+" Y :"+y);
			System.out.println("Local X:"+ x);
			System.out.println("Inner Class X:"+this.x);
			System.out.println("Inner Class X:"+Inner.this.x);
			System.out.println("Outer Class X:"+Outer.this.x);
		}
		
	}
	public void m2()
	{
		Inner i=new Inner();
		i.m1();
	}
		
	
}