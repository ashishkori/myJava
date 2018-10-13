package InnerClass;

public class MethodLocalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local l=new Local();
		l.localM();

	}

}
class Local
{
	public void localM()
	{
		class Inner{
			public void sum(int x,int y)
			{
				System.out.println("The Sum is :"+x+y);
			}
		}
		Inner i=new Inner();
		i.sum(10, 20);
		i.sum(120, 20);
		i.sum(110, 200);
		i.sum(10, 620);
		i.sum(105, 220);
	}
	}