package LambdaExpression;

public class MultipleInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test1 t=new Test1();
		t.m();
		Left.m2();
		Right.m2();
		Test1.m2();
	

	}

}
interface Left
{
	default void m()
	{
		System.out.println("Left Default Method");
	}
	static void m2()
	{
		System.out.println("Left Static method");
	}
}

interface Right
{
	default void m()
	{
		System.out.println("Right Default Method");
	}
	static void m2()
	{
		System.out.println("Right Static method");
	}
}
class Test1 implements Left, Right
{
	//Left.super.m(); Its Not working in my System
	public void m()
	{
		Left.super.m();
		System.out.println("Test1 Default Method");
		Right.super.m();
	 }
	static void m2()
	{
		System.out.println("TEST1 Static method");
	}
	
}

/*
 class Test2 implements Left, Right
 {	
 } //Unresolved compilation problem: Duplicate default methods named m with the parameters () and () are inherited from the types Right and Left

*/