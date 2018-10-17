package LambdaExpression;
public class ConstructorRefDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceA i=Sample::new; 
		Sample s1=i.get();
		Sample s2=i.get();
		Sample s3=i.get();
		Sample s4=i.get();

	}

}
interface InterfaceA
{
	public Sample get();
}
class Sample
{
	Sample()
	{
		System.out.println("Sample class Constructor");
	}
}
