import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
//import java.util.Scanner;
public class CheckMobileNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String n=scan.nextLine();
		Pattern p= Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m=p.matcher(n);
		if(m.find() && m.group().equals(n))
		{
			System.out.println(n+" is Valid Mobile No");
		}
		else
			System.out.println(n+" is Not Valid Mobile No");
		
		
		

	}

}
