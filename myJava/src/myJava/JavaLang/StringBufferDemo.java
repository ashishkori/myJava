package myJava.JavaLang;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());
		sb.append("abcdefghijklmn");
		System.out.println("Capacity: "+ sb.capacity()+"  Length"+sb.length());
		sb.append("opqrstuvwxyz");
		System.out.println("Capacity: "+ sb.capacity()+"  Length"+sb.length());
		sb.append("0123456789");
		System.out.println("Capacity: "+ sb.capacity()+"  Length"+sb.length());
		//sb.append("opqrstuvwxyz");
		System.out.println(sb.reverse());// Reverse StringBuffer This Method is not Available in String Class
		System.out.println("StringBuffer constructor for String Object ");
		sb=new StringBuffer("ashish Kumar Kori");//Default StringBuffer capacity for String= String length+16
		
		System.out.println("StringBuffer: "+sb.toString()+"  Capacity: "+ sb.capacity()+"  Length: "+sb.length());
		sb.ensureCapacity(1000);//Increase Capacity on Fly
		sb.setLength(10);
		
		System.out.println("StringBuffer: "+sb.toString()+"  Capacity: "+ sb.capacity()+"  Length: "+sb.length());
		sb.trimToSize();
		System.out.println(sb.capacity());
		
		


	}

}
