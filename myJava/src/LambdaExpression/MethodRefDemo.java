package LambdaExpression;

public class MethodRefDemo {

	static void sum(int x,int y)
	{
		System.out.println("Sum is :"+(x+y));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Interf i=MethodRefDemo::sum;
		i.add(10,20);
		MethodRefDemo.sum(10,20);
	//	i.sum(23,67); CE: The method sum(int, int) is undefined

	}

}
interface Interf
{
	public void add(int x,int y);
}
