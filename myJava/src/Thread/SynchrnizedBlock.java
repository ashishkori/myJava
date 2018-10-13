package Thread;

public class SynchrnizedBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d=new Display();
		ThreadDem t=new ThreadDem(d,"Dhoni");
		ThreadDem t1=new ThreadDem(d,"Yuraj");
		t.start();
		t1.start();
		

	}

}
class Display
{
	public void wish(String s)
	{
		synchronized(this) 
		{
			for(int i=0;i<10;i++)
			{
				System.out.print("Good Morning :");
				try {
					Thread.sleep(100);
				}catch(InterruptedException e) {};
				System.out.println(s);
			}
		}		
		//System.out.println("Good Night :"+s);
	}
}
class ThreadDem extends Thread
{
	Display d;
	String n;
	ThreadDem()
	{
		
	}
	ThreadDem(Display d, String n)
	{
		this.d=d;
		this.n=n;
	}
	public void run()
	{
		d.wish(n);
	}
}