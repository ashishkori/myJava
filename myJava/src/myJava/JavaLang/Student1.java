package myJava.JavaLang;

public class Student1 {
	int rollNo;
	String Name;
	public Student1() {
		super();
	}
	public Student1(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		Name = name;
	}
	@Override
	public String toString() {
		return "Student1 [rollNo=" + rollNo + ", Name=" + Name + "]";
	}
	@Override
	public  int hashCode()
	{
		return rollNo;
	}
	@Override
	/*public boolean equals(Object obj)
	{
		
		//Student1 s=(Student1)obj;
		try {
		if(this.rollNo==((Student1)obj).rollNo && this.Name.equals(((Student1)obj).Name))
			return true;
		return false;
		} catch(ClassCastException e) {return false;}
		catch(NullPointerException e) {return false;}
	}*/
	
	public boolean equals(Object obj)
	{
		if(obj==this)
			return true; 
		
	if(obj instanceof Student1)
	 {
		if(this.rollNo==((Student1)obj).rollNo && this.Name.equals(((Student1)obj).Name))
			return true;
		return false;
		} 
	return false;
	}
}
