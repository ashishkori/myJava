package Thread;

public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread T =new myThread();
		T.start();// creates new thread so total two thread is running in this case two thread is created one is main thread and other is myThread.
		//T.run();
		//only one threads thread is called by main  i.e only one thread is there. 
		for(int i=0;i<10;i++) //executed by main Thread
		{
			System.out.println("Main Thread");
		}
	//	T.start();//  will Produce R.E IllegalThreadStateException
	}

}
//########---defining Thread---######## 
class myThread extends Thread{ 
	/*  
	public void start() //override main method but it will work as normal function call
	{
		super.start(); // if we want to call thread class start method
		System.out.println("Start Thread");
	}
	*/
	public void run()
	{
		for(int i=0;i<10;i++)   
		{
			System.out.println("Child Thread");
		}
	}
	
	public void run(int x)
	{
		for(int i=0;i<10;i++)   
		{
			System.out.println(i+" : arg Child Thread");
		}
	}
}