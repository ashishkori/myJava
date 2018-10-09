package myJava.OOPs;

public class OverLodingDemo2 {

	public void m(String x)
	{
		System.out.println("String method "+ x);
	}
	public void m(Object x)
	{
		System.out.println("Object method ");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Automatic promoption in Overloading Case 2");
		OverLodingDemo2 object=new OverLodingDemo2();
		//short z=12; byte x=1;
		
		object.m("Ashish Kumar Kori");
		object.m(new String("String Object"));
		object.m(new Object());
		object.m(null);
		

	}

}
