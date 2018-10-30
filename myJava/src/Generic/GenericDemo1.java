package Generic;

public class GenericDemo1 <T extends Number> {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Generic Demo 1");
		GenericDemo1<Integer> t1=new GenericDemo1<Integer>();
		GenericDemo1<Double> t2=new GenericDemo1<Double>();
		// GenericDemo1<String> t3=new GenericDemo1<String>();  // Unresolved compilation problems:  Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type GenericDemo1<T>
	   Generic1<String> s1=new Generic1<String>();	
	   Generic1<Object> o1=new Generic1<Object>();
	   Generic1<Student> o2=new Generic1<Student>();
	}

}
class Generic1 < T >
{
	Generic1() 
	{
		System.out.println("Generic Object created");
	}
	//
	}