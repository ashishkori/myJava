package myJava.OOPs;

public class OverRidingDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OverRidingDemo1 t=new OverRidingDemo1();
		System.out.println("Overriding Example");
		Parent p=new Parent();
		Child c=new Child();
		Parent p1=new Child();
	
		p.marry(); //Parent Marry Method
		c.marry(); //Child Marry Method
		p1.marry(); // Child Marry Method

	}

}
class Parent{
	public void marry()
	{
		System.out.println("Parent Marry Method");
		
	}
}
class Child extends Parent
{
	@Override
	
	public void marry()
	{
		System.out.println("Child Marry Method");
		//return null;
	}
}