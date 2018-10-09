import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo2 {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Pattern p =Pattern.compile("aaa");
			Matcher m=p.matcher("AbAnAAabXSZaaAaaaa #$ 1023>.");
		//Matcher m7=p1.matcher("abcPQRST789.,`$%^&+=");

			
			int count=0;
			while(m.find())
			{
				count++;
				System.out.print(m.start()+"---"+" "+ m.group()+", ");
			}
			System.out.println();
			System.out.println(count);
			
			 p =Pattern.compile("aa+");
			 m=p.matcher("AbAnAAabXSZaaAaaaa #$ 1023>.");
		//Matcher m7=p1.matcher("abcPQRST789.,`$%^&+=");

			
			count=0;
			while(m.find())
			{
				count++;
				System.out.print(m.start()+"---"+" "+ m.group()+", ");
			}
			System.out.println();
			System.out.println(count);
			 p =Pattern.compile("aa*");
			 m=p.matcher("AbAnAAabXSZaaAaaaa #$ 1023>.");
		//Matcher m7=p1.matcher("abcPQRST789.,`$%^&+=");

			
			count=0;
			while(m.find())
			{
				count++;
				System.out.print(m.start()+"---"+" "+ m.group()+", ");
			}
			System.out.println();
			System.out.println(count);
			 p =Pattern.compile("a*");
			 m=p.matcher("AbAnAAabXSZaaAaaaa #$ 1023>.");
		//Matcher m7=p1.matcher("abcPQRST789.,`$%^&+=");
			 p =Pattern.compile("aaa*");
			 m=p.matcher("AbAnAAabXSZaaAaaaaAaaa #$ 1023>.");
		//Matcher m7=p1.matcher("abcPQRST789.,`$%^&+=");

			
			count=0;
			while(m.find())
			{
				count++;
				System.out.print(m.start()+"---"+" "+ m.group()+", ");
			}
			System.out.println();
			System.out.println(count);
			
			count=0;
			while(m.find())
			{
				count++;
				System.out.print(m.start()+"---"+" "+ m.group()+", ");
			}
			System.out.println();
			System.out.println(count);
			 p =Pattern.compile("aa?");
			 m=p.matcher("AbAnAAabXSZaaAaaaa #$ 1023>.");
		//Matcher m7=p1.matcher("abcPQRST789.,`$%^&+=");

			
			count=0;
			while(m.find())
			{
				count++;
				System.out.print(m.start()+"---"+" "+ m.group()+", ");
			}
			System.out.println();
			System.out.println(count);
			p =Pattern.compile("[ ]");
			String s[]=p.split("ashish.kumar.kori. Ashish Kumar Kori Sultanpur Uttar Pradesh");
		//Matcher m7=p1.matcher("abcPQRST789.,`$%^&+=");
			for(String s1:s)
			{
				System.out.println(s1);
			}
			
			
			
		}

	}
