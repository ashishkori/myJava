package Thread;

public class DaemonThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Thread.currentThread().isDaemon());
		/*
		 * Thread.currentThread().setDaemon(true);//RE IllegalThreadStateException
		 */
		Daemon t=new Daemon();
		System.out.println(t.isDaemon());
		t.setDaemon(true);;
		System.out.println(t.isDaemon());
		t.start();
		System.out.println("End of Main Thread");//If last non Daemon thread terminates all Daemon thread must terminate its execution
		
		
	}

}
class Daemon extends Thread
{
	public void run()
	{
		for(int i=0;i<100;i++)
		{
			System.out.println((i+1)+" Child Thread");
			
			
		}
	}
	
}