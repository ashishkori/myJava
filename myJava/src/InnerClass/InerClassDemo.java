package InnerClass;

public class InerClassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Car Class");
		Car c=new Car();
		Car.Engine e=c.new Engine();
		e.m1();
		
		
	}

}
class Car{
	class Engine{
		public void m1()
		{
			System.out.println("Engine Class Method");
		}
	}
}