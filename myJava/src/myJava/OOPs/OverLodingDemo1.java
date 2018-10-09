package myJava.OOPs;

public class OverLodingDemo1 {
	public void m(byte x)
	{
		System.out.println("Byte method "+ x);
	}
	public void m(int x)
	{
		System.out.println("Int method "+ x);
	}
	public void m(float x)
	{
		System.out.println("Float method "+ x);
	}
	public void m(double x)
	{
		System.out.println("Double method "+ x);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Automatic promoption in Overloading");
		OverLodingDemo1 object=new OverLodingDemo1();
		short z=12; byte x=1;
		
		object.m(z);
		object.m('a');
		object.m(10);
		object.m(20.5f);
		object.m(26l);
		object.m(50.0);
		object.m(x);

	}

}
