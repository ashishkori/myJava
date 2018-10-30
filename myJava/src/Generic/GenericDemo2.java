package Generic;

public class GenericDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Generic2<xyz> t1=new Generic2<xyz>();
	}

}
class Generic2 < T extends Number & Runnable >
{
	Generic2() 
	{
		System.out.println("Generic Object created");
	}
	//
}
class xyz extends Number implements Runnable
{
	public void run()
	{}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	}