package myJava.OOPs;

public class OverLodingDemo6 {

		
		public void m(Animal a)
		{
			System.out.println("Animal Version");
		}

		public void m(Monkey i)
		{
			System.out.println("Monkey Version");
		}
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			System.out.println("Automatic promoption in Overloading Case 6");
			OverLodingDemo6 object=new OverLodingDemo6();
			//short z=12; byte x=1;
			Animal a1=new Animal();
			Monkey m1=new Monkey();
			Animal a2=new Monkey();
			
			
			object.m(a1);//Animal Version
			object.m(m1); //Monkey Version
			//object1.m(m1);
			object.m(a2);//Animal Version
		}

	}
class Animal
{
	}
class Monkey extends Animal
{
	
	
	}
