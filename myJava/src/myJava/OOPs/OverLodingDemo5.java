package myJava.OOPs;

public class OverLodingDemo5 {

	

		public void m(int i)
		{
			System.out.println("General method");
		}
		public void m(int ... i)
		{
			System.out.println("Var-arg method");
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("Automatic promoption in Overloading Case 4");
			OverLodingDemo5 object=new OverLodingDemo5();
			//short z=12; byte x=1;
			
			object.m();//Var-arg method
			
			object.m(20,10);//Var-arg method 
			object.m(20);//General method
			object.m(20,25,25,52,36);//Var-arg method

		}

	}
