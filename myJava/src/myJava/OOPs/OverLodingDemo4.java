package myJava.OOPs;

public class OverLodingDemo4 {

	public void m(int i, float f)
	{
		System.out.println("Int-Float method");
	}
	public void m(float f, int i)
	{
		System.out.println("Float-Int method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Automatic promoption in Overloading Case 4");
		OverLodingDemo4 object=new OverLodingDemo4();
		//short z=12; byte x=1;
		
		object.m(10,15.0f); //Int-Float method
		
		object.m(10.5f,10); //Float-Int method
		
		//object.m(10.5f,10.0f); //object.m(10,10); Error: Unresolved compilation problem: 
		//The method m(float, int) in the type OverLodingDemo4 is not applicable for the arguments (float, float)
		
		//object.m(new Object()); // Unresolved compilation problems: 
		//The method m(float, int) in the type OverLodingDemo4 is not applicable for the arguments (float, float)
		//The method m(int, float) in the type OverLodingDemo4 is not applicable for the arguments (Object)
		// object.m(null);//Error Unresolved compilation problem:  The method m(String) is ambiguous for the type OverLodingDemo3
		

	}

}
