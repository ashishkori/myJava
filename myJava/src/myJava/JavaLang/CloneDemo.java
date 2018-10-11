package myJava.JavaLang;


 class CloneDemo implements Cloneable {

	int i=10;
	int j=20;
	
	@Override
	public String toString() {
		return "Clone Items [i=" + i + ", j=" + j + "]";
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		CloneDemo t=new CloneDemo();
		CloneDemo t1=(CloneDemo)t.clone();
		t1.i=999;
		t1.j=555;
		System.out.println(t.i+" "+t.j);
		System.out.println(t);
		System.out.println(t1);
		//System.out.println(t1.i+" "+t1.j);
		
	}

}
 
