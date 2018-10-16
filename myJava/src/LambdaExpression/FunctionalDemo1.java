package LambdaExpression;

class FunctionalDemo1 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A x=new A();
		x.m();
		Functional f=()->System.out.println("Lamda Expression implemetation of Method");//Lambda Expression implementation
		f.m();
		f.m2();
		Functional.m3();//Static method call
		B i = (a,b)->System.out.println("The sum is "+ (a+b));
		i.add(15, 20);
		i.add(150, 200);
		i.add(15, 200);
		//Square s=n->n*n;//Square function Lambda Expression
		//Square s=(n)->n*n; //Valid
		//Square s=n->{n*n}; //java.lang.Error: Unresolved compilation problems: Must use return keyword with braces
		Square s=n-> {return n*n;}; //Vailid
		//Square s=n->{n*n;} // inValid
		System.out.println("The square of 2 is :"+s.square(2));;
		System.out.println("The square of 12 is :"+s.square(12));;
		System.out.println("The square of 112 is :"+s.square(112));;
	}

}
