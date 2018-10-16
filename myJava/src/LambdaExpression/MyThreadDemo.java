package LambdaExpression;

public class MyThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Lambda expression Implemetation of Child Thread");
			}
		};
		Thread t= new Thread(r);
		t.start();
		Thread t1=new Thread(new MyRunnable());
		t1.start();
		for(int i=0;i<10;i++)
		{
			System.out.println("Main Thread");
		}
	}

}
class MyRunnable implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Class Implemetation of Child Thread");
		}
	}
	}
