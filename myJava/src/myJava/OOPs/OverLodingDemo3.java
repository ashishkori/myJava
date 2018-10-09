package myJava.OOPs;

public class OverLodingDemo3 {

	public void m(String x)
	{
		System.out.println("String method ");
	}
	public void m(StringBuffer x)
	{
		System.out.println("StringBuffer method ");
	}
	public void m(Object x)
	{
		System.out.println("Object method ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Automatic promoption in Overloading Case 3");
		OverLodingDemo3 object=new OverLodingDemo3();
		//short z=12; byte x=1;
		
		object.m("Ashish Kumar Kori");
		object.m(new StringBuffer("String Object")); 
		//object.m(new Object());
		// object.m(null);//Error Unresolved compilation problem:  The method m(String) is ambiguous for the type OverLodingDemo3
		

	}

}
