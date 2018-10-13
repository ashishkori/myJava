package InnerClass;
import java.util.*;
public class Codechef {

	    public static void main(String args[] ) {
	      Scanner scan=new Scanner(System.in);
	      int t=scan.nextInt();
	      while(t-->0)
	      {
	          long x=scan.nextLong();
	          long y=scan.nextLong();
	          Double att=Math.ceil(x*.75);
	          long ab= (new Double(att)).longValue();
	          if(y>=ab)
	          System.out.println(0);
	          else
	          {
	              long z=3*x-4*y;
	              System.out.println(z);
	          }
	      }
	    }
	}