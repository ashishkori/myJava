package ConcurrentCollection;

import java.util.ArrayList;
import java.util.Iterator;

public class CocurentCollectionDemo extends Thread{
	static ArrayList l=new ArrayList();
	public void run() {
		try
		{
			Thread.sleep(2000);
		}
		catch (InterruptedException e)
		{
			
		}
		System.out.println("Child Thread Updating");
		l.add(2,26);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		l.add(26);
		l.add(260);
		l.add(56);
		l.add(580);
		l.add(36);
		CocurentCollectionDemo t=new CocurentCollectionDemo();
		t.start();
		Iterator itr =l.iterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			//itr.next()
			System.out.println("Current element is "+s);
			try
			{
				Thread.sleep(3000);
			}
			catch(InterruptedException e)
			{
				
			}
		}

	}

}
