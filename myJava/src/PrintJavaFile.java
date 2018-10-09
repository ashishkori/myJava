import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PrintJavaFile {
	public static void main(String[] args) {
		String re="[a-zA-Z0-9_.$]+[.](java|class)";
		Pattern p= Pattern.compile(re);
		
		File f= new File("D:\\windows 10 data\\eclipse-workspace\\myJava\\src");
		String s[]=f.list();
		int count=0;
		for(String s1:s)
		{
			Matcher m=p.matcher(s1);
			if(m.find()&& m.group().equals(s1))
			{ count++;
				System.out.println(s1);
			}
		}
		System.out.println(count);
		
		

	}

}
