package LambdaExpression;

public class Default1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Default Method Example");
		T1 t=new T1();
		T2 t2=new T2();
		T3 t3=new T3();
		t.m4();
		t2.m4();
		t3.m4();
	}

}

 interface DefaultMethodDemo {
	
	public void m1();
	public void m2();
	public void m3();
	default void m4()
	{
		System.out.println("Default Method");
	}
}
class T1 implements DefaultMethodDemo
{
	public void m1() { }
	public void m2() { }
	public void m3() { }
	public void m4()
	{
		System.out.println("Default Method in T1");
	}
}

class T2 implements DefaultMethodDemo
{
	public void m1() { }
	public void m2() { }
	public void m3() { }
	
}
class T3 implements DefaultMethodDemo
{
	public void m1() { }
	public void m2() { }
	public void m3() { }
	public void m4()
	{
		System.out.println("Default Method in side T3");
	}
}
class T4 implements DefaultMethodDemo
{
	public void m1() { }
	public void m2() { }
	public void m3() { }
}
class T5 implements DefaultMethodDemo
{
	public void m1() { }
	public void m2() { }
	public void m3() { }
}
class T6 implements DefaultMethodDemo
{
	public void m1() { }
	public void m2() { }
	public void m3() { }
}
