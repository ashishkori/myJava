package myJava.OOPs;
public class OverRidingDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//OverRidingDemo1 t=new OverRidingDemo1();
		System.out.println("Covarient Return Type Example in OverRiding");
		System.out.println();
		Parent1 p=new Parent1();
		Child1 c=new Child1();
		p.marry(); //Parent Marry Method
		c.marry(); //Child Marry Method
		

	}

}
class Parent1{
	public Object marry()
	{
		System.out.println("Parent Marry Method");
		return null;
	}
}
class Child1 extends Parent1
{
	@Override
	
	public String marry()
	{
		System.out.println("Child Marry Method");
		return null;
	}
}