import java.util.*;
public class ThreadPriorityDemo {
	
	public static void main(String[] args) {
		System.out.println();
		MyThread t=new MyThread();
		///MyThread t2=new MyThread();
		//t2.start();
		//t.setPriority(10);
		
		//Thread.currentThread().setName("Main Thread");
		//Thread.currentThread().setPriority(11);// RE: java.lang.IllegalArgumentException
		//Thread.currentThread().setPriority(4);
		t.start();
		for(int i=1;i<10;i++)
		{
			System.out.println(i+": Main Thread");
		}
		//System.out.println(Thread.currentThread().getName()+" "+Thread.currentThread().getPriority());
		//System.out.println();
	}

}
class MyThread extends Thread{
	public void run()
	{
		//System.out.println("Child Thread");
		Thread.currentThread().setName("Child Thread");
		//System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getPriority());
		//Thread.currentThread().setPriority(9);
		//System.out.println(Thread.currentThread().getName()+" "+ Thread.currentThread().getPriority());
		//System.out.println();
		for(int i=1;i<10;i++)
		{
			System.out.println(i+": Child Thread");
			Thread.yield();
		}
		
	}
}
