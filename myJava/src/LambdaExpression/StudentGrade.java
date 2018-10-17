package LambdaExpression;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.function.Function;

public class StudentGrade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Student Grade Example");
		Function<Student,Character> g=(s)->{
			int mark=s.mark;
			char x;
			if(mark>80)
				x='A';
			else if(mark>70)
				x='B';
			else if(mark>60)
				x='C';
			else if(mark>50)
				x='D';
			else if(mark>40)
				x='E';
			else 
				x='F';
			return x;
		};
		ArrayList<Student> l=new ArrayList<Student>();
		l.add(new Student("Ashish",95));
		
		l.add(new Student("Shisha",72));
		l.add(new Student("Yogesh",65));
		l.add(new Student("Somi",55));
		l.add(new Student("Amit",85));
		l.add(new Student("Shubham",41));
		l.add(new Student("Sumnny",68));
		l.add(new Student("Manish",37));
		l.add(new Student("Shree",20));
/*		Comparator<Student> c=(St1,St2)->
		{
			return St1.name.compareTo(St2.name);
		};
*/
		Collections.sort(l, (s1,s2)->{return -s1.name.compareTo(s2.name);});
		for(Student s1:l)
		{
			System.out.print(s1.name+" : ");
			System.out.println(g.apply(s1));
		}
		

	}

}
class Student
{
	String name;
	int mark;
	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}
	
}
