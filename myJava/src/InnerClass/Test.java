package InnerClass;

public class Test
{ 
	int x=0;
	static int y=100;
	static class Nested 
	{
		public static void main(String[] args)
		{
			System.out.println(y);
			//System.out.println(x); // CE:Unresolved compilation problem:  Cannot make a static reference to the non-static field x

			System.out.println("Inner Class Main Method");
		}
		
	}
	public static void main(String[] args)
		{
			System.out.println("Outer Class Main Method");
		}
}