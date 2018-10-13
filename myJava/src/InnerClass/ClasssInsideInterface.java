package InnerClass;

public class ClasssInsideInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle.Default d=new Vehicle.Default();
		d.getWeels();
		Bus b=new Bus();
		b.getWeels();//
	}

}
interface Vehicle
{
	public void getWeels();
	class Default implements Vehicle
	{
		public void getWeels()
		{
			System.out.println(2);
		}
	}
}
class Bus implements Vehicle
{
	public void getWeels()
	{
		System.out.println(6);
	}
}
