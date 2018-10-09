import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegulaeExpresionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Pattern p =Pattern.compile("ab");
		Pattern p1 =Pattern.compile("[a-z]");
		Pattern p2 =Pattern.compile("[A-Z]");
		Pattern p3 =Pattern.compile("[0-9]");
		Pattern p4 =Pattern.compile("[a-zA-Z]");
		Pattern p5 =Pattern.compile("[0-9a-zA-Z]");
		Pattern p6 =Pattern.compile("[^0-9a-zA-Z]");
		Matcher m=p.matcher("abaaabbbaabbbacdefgh");
	//Matcher m7=p1.matcher("abcPQRST789.,`$%^&+=");

		
		int count=0;
		while(m.find())
		{
			count++;
			System.out.print(m.start()+" "+ m.end()+" "+ m.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		Matcher m1=p1.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m1.find())
		{
			count++;
			System.out.print(m1.start()+"--"+ m1.end()+"--"+ m1.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		
		Matcher m2=p2.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m2.find())
		{
			count++;
			System.out.print(m2.start()+"--"+ m2.end()+"--"+ m2.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		Matcher m3=p3.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m3.find())
		{
			count++;
			System.out.print(m3.start()+"--"+ m3.end()+"--"+ m3.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		Matcher m4=p4.matcher("abaaabbbaabbbacdefgh");
		while(m4.find())
		{
			count++;
			System.out.print(m4.start()+"--"+ m4.end()+"--"+ m4.group()+", ");
		}
		
		System.out.println();
		System.out.println(count);
		Matcher m5=p5.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m5.find())
		{
			count++;
			System.out.print(m5.start()+"--"+ m5.end()+"--"+ m5.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		
		Matcher m6=p6.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m6.find())
		{
			count++;
			System.out.print(m6.start()+"--"+ m6.end()+"--"+ m6.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		p6 =Pattern.compile("\\s");
		m6=p6.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m6.find())
		{
			count++;
			System.out.print(m6.start()+"--"+ m6.end()+"--"+ m6.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		p6 =Pattern.compile("\\S");
		m6=p6.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m6.find())
		{
			count++;
			System.out.print(m6.start()+"--"+ m6.end()+"--"+ m6.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		
		p6 =Pattern.compile("\\w");
		m6=p6.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m6.find())
		{
			count++;
			System.out.print(m6.start()+"--"+ m6.end()+"--"+ m6.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		
		p6 =Pattern.compile("\\W");
		m6=p6.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m6.find())
		{
			count++;
			System.out.print(m6.start()+"--"+ m6.end()+"--"+ m6.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		p6 =Pattern.compile("\\d");
		m6=p6.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m6.find())
		{
			count++;
			System.out.print(m6.start()+"--"+ m6.end()+"--"+ m6.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		p6 =Pattern.compile("\\D");
		m6=p6.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m6.find())
		{
			count++;
			System.out.print(m6.start()+"--"+ m6.end()+"--"+ m6.group()+", ");
		}
		System.out.println();
		System.out.println(count);
		p6 =Pattern.compile("\\.");
		m6=p6.matcher("abaaabbbaabbbacdefgh");
		count=0;
		while(m6.find())
		{
			count++;
			System.out.print(m6.start()+"--"+ m6.end()+"--"+ m6.group()+", ");
		}
		System.out.println();
		System.out.println(count);

	}

}
