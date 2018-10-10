package myJava.JavaLang;

public class AutoUnboxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer I=new Integer(10);
		int i=I;
		//System.out.println(I.intValue());
		System.out.println(i);//Changed to int i=I.intValue() after compilation;

	}

}
