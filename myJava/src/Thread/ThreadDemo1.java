package Thread;

public class ThreadDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myThread2 T =new myThread2();
		T.start();// creates new thread so total two thread is running in this case two thread is created one is main thread and other is myThread.
		//T.run();
		//only one threads thread is called by main  i.e only one thread is there. 
		System.out.println(Thread.currentThread().getPriority());
	//	T.start();//  will prodice R.E IllegalThreadStateException
	}

}
//########---defining Thread---######## 
class myThread2 extends Thread{ 
	/*  
	public void start() //override main method but it will work as normal function call
	{
		super.start(); // if we want to call thread class start method
		System.out.println("Start Thread");
	}
	*/
	//System.out.println();
	public void run(int x)
	{
		System.out.println(Thread.currentThread().getPriority());

		for(int i=0;i<10;i++)   
		{
			System.out.println(i+" : arg Child Thread");
		}
	}
	//System.out.println(Thread.currentThread().getPriority());

}