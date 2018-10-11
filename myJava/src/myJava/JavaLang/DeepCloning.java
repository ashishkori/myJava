package myJava.JavaLang;

public class DeepCloning {
	public static void  main(String [] args) throws CloneNotSupportedException
	{
		Cat c=new Cat(10);
		Dog d1=new Dog(c,15);
	 	
	}
}
