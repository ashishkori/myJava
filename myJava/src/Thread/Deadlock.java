package Thread;

public class Deadlock extends Thread{

	A a=new A();
	B b=new B();
	public void m()
	{
		this.start();
		a.m1(b);
	}
	public void run() 
	{
		b.m1(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deadlock t=new Deadlock();
		t.m();

	}

}
class A
{
	synchronized public void m1(B b)
	{
		System.out.println("Inside A m1 method");
		System.out.println("Calling B's last method");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {};
		b.last();
	}
	synchronized public void last()
	{
		System.out.println("Inside A's Last method");

	}

	
}

class B
{
	synchronized public void m1(A a)
	{
		System.out.println("Inside B's m1 method");
		System.out.println("Calling A's last method");
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {};
		a.last();
	}
	//synchronized public void last() //Deadlock Conditation
	 public void last()
	{
		System.out.println("Inside B's Last method");

	}
}
