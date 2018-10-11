package myJava.JavaLang;

public class ShallowVsDeepCloning {
	public static void  main(String [] args) throws CloneNotSupportedException
	{
		Cat c=new Cat(10);
		Dog d1=new Dog(c,15);
		Dog d2=(Dog)d1.Clone();
		System.out.println("Before Cloning");
		System.out.println("D1 is "+d1.c.j+"........"+d1.i);
		d2.c.j=999;
		d2.i=888;
		System.out.println("After Cloning and update on d2");
		System.out.println("D1 is "+d1.c.j+"......."+d1.i);
		System.out.println("D2 is "+d2.c.j+"........"+d2.i);
	}
}
class Cat{
	int j;
	Cat(int j)
	{
		this.j=j;
	}
	
	
}
class Dog implements Cloneable
{
	Cat c;
	int i;
	Dog(Cat c,int i)
	{
		this.c=c;
		this.i=i;
	}

  	public Object Clone() throws CloneNotSupportedException
	{
  		System.out.println("---------Shallow Cloning Example-----");
		
		return super.clone();
	}

	/*
	public Object Clone() throws CloneNotSupportedException
	{
		System.out.println("---------DeepCloning Example-----");
		Cat c1=new Cat(c.j);
		Dog d2=new Dog(c1,i);
		return d2;
		
	}
	*/
	
}