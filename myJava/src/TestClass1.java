import java.util.*;
public class TestClass1 {

	public static void main(String[] args) {
		 Scanner scan=new Scanner(System.in);
	        int  n=scan.nextInt();
	        int a[][]=new int[n][2];
	        for(int i=0;i<n;i++)
	        {
	            a[i][0] =scan.nextInt();
	            a[i][1] =scan.nextInt();
	        }
	        int max=0;
	        for(int i=0;i<n;i++)
	        {
	            if(a[i][0]%a[i][1]!=0) 
	            {
	                int x=(int)Math.ceil(a[i][0]/(double)a[i][1]);
	                max=Math.max(max,(x*a[i][1]-a[i][0]));
	            }
	        }
	       System.out.println(max);
	    }
	}
