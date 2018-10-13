package InnerClass;

public class AnonymousInnerClass {

	public static void main(String [] args)
	{
		Popcorn p1=new Popcorn(){
			public void taste()
			{
				System.out.println("Sweet");
			}
		};
		
		Popcorn p2=new Popcorn(){
			public void taste()
			{
				System.out.println("Salty");
			}
		};
		Popcorn p3=new Popcorn();
		p1.taste();
		p2.taste();
		p3.taste();
		System.out.println(p1.getClass().getName());
		System.out.println(p2.getClass().getName());
		System.out.println(p3.getClass().getName());
	}
}
class Popcorn
{
	public void taste()
	{
		System.out.println("Spicy");
	}
}