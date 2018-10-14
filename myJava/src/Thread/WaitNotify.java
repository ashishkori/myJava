package Thread;

public class WaitNotify {

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		Threadb b=new Threadb();
		b.start();
		synchronized(b)
		{
			try {
				b.wait();
			}
			catch(InterruptedException e) {};
		}
		System.out.println("Main Class after notification");
		
		System.out.println(b.total);
	}

}
class Threadb extends Thread
{
	int total=0;
	
	
	public void run()
	{
		synchronized(this)
		{
			for(int i=1;i<=100;i++)
			{
				total+=i;
			}
		
		System.out.println("Child Thread trying to give notification");
		this.notify();
		}
	}
}