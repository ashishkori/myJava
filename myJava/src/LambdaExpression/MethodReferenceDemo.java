package LambdaExpression;

public class MethodReferenceDemo {
	public static void m1()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Static Method Thread");
		}
	}
	public void m2()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Child Instance Method Thread");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	Runnable r1=()->{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread");
			}
		}; // can we written as  Runnable r= MethodReferenceDemo::m1 using method refrence
	*/	
		Runnable r= MethodReferenceDemo::m1;
		MethodReferenceDemo mr=new MethodReferenceDemo();
		Runnable r2=mr::m2;
		Thread t=new Thread(r);
		Thread t2=new Thread(r2);
		t.start();
		t2.start();
		for(int i=0;i<5;i++)
		{
			System.out.println("Main Thread");
		}
		
	}

}
