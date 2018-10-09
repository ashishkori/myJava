import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckEmailID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		String re="[a-zA-Z0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+(([.][a-zA-Z]+)+)*";
		Pattern p= Pattern.compile(re);
		Matcher m=p.matcher(n);
		if(m.find() && m.group().equals(n))
		{
			System.out.println(n+" is Valid EmailID");
		}
		else
			System.out.println(n+" is Not Valid EmailID");
		
		
		

	}

}
