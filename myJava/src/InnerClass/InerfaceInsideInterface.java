package InnerClass;

public class InerfaceInsideInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t1=new Test1();
		Test2 t2=new Test2();
		t1.m2();
		t2.m1();

	}

}
interface Out
{
	public  void m2();
	interface Inner
	{
		public void m1();
	}
}
class Test1 implements Out
{
	public void m2()
	{
		System.out.println("Outer Interface Implemetation");
	}
}
class Test2 implements Out.Inner
{
	public void m1()
	{
		System.out.println("Inner Interface Implemetation");
	}
}