package InnerClass;

public class ThreadInnerClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Runnable()
				{
					public void run()
					{
						for(int i=0;i<5;i++)
						{
							System.out.println("Child Thread");
						}
					}
				};
		Thread t=new Thread(r);
		
		t.start();
/*		Thread t2=new Thread(new Runnable() 
		{
			public void run()
			{
				for(int i=0;i<5;i++)
				{
					System.out.println("Child-2 Thread");
				}
			}
		} );t2.start();
*/		new Thread(new Runnable() 
			{
				public void run()
					{
					for(int i=0;i<5;i++)
						{
							System.out.println("Child-2 Thread");
						}
					}
			} ).start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}

	}

}
