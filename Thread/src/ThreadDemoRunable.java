
public class ThreadDemoRunable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		myRunable r=new myRunable();
		Thread t=new Thread(r);
		t.start();
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		Thread.currentThread().setName("Ashish");
		t.setName("Kumar thread");
		System.out.println(Thread.currentThread().getName());
		System.out.println(t.getName());
		System.out.println(10/0);//
		

	}

}
class myRunable implements Runnable{
	public void run()
	{
		

		for(int i=0;i<10;i++)   
		{
			System.out.println("Child Thread");
		}
	}
	
}