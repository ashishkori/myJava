
package LambdaExpression;

interface Functional {
	 abstract void m();
	 //abstract void m4(); //Unresolved compilation problem: The target type of this expression must be a functional interface
	 default void m2() 
	 {	 
		 System.out.println("Default method in side Interface");
	 }
	 static void m3() 
	 { 
		 System.out.println("Static method in side Interface");
	 }
	}
	class A implements Functional
	{
		public void m()
		{
			System.out.println("Implemented Class implementation of Interface"); 
		}
	}

interface B
{
   abstract void add(int a,int b);
}
interface Square
{
	abstract int square(int n);
}