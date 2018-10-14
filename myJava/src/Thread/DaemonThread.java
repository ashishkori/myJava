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
		
		
	}

}
class Daemon extends Thread
{
	}