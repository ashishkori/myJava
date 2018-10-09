package myJava.OOPs;

public class OverRidingDemo7 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Method hiding example");
		//OverLodingDemo6 object=new OverLodingDemo6();
		//short z=12; byte x=1;
		P p=new P();
		C c =new C();
		P p1=new C();
		p.m(); //Parent
		c.m(); //Child
		p1.m(); // Parent
		P.m(); //Parent
		C.m(); //Child
		//p1.m(); // Parent
		
		
	}

}
class P
{
	public static void m()
	{
		System.out.println("Parent");
	}
}
class C extends P
{
	public static void m()
	{
		System.out.println("Child");
	}

}
