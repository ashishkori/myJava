package myJava;
import java.util.*;
public class TestClass {
	public static int mysearch(int a[], int x)
	{
		int n=a.length;
		int l=0;
		int r=n-1;
		while(l<r)
		{
			int mid=(l+r)/2;
			if(a[mid]==x)
				return x;
			else if(a[mid]>x)
				r=mid-1;
			else
				l=mid+1;
			
			
		}
		
		return r+1;
	}
	public static void main(String args[])
	{
	 Scanner scan=new Scanner(System.in);
     int n=scan.nextInt();
     int a[]=new int[n];
     int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
     for(int i=0;i<n;i++)
     {
         a[i]=scan.nextInt();
         max=Math.max(max,a[i]);
         min=Math.min(min,a[i]);
         //sum=sum+a[i];
     }
     System.out.println();
     //Arrays.sort(a);
     int q=scan.nextInt();
     int dp[]=new int[max+1];
     for(int i=1;i<=max;i++)
     {
         int sum=0;
         for(int j=0;j<n;j++)
         {
             if(a[j]>=i)
             sum+=i; 
             else
             sum+=a[j];
         }
         dp[i]=sum;
     }
   /*
     for(int i=1;i<=max;i++)
     {
         System.out.print(dp[i]+" ");
     }
    */
    
     while(q-->0)
     {
         int x=scan.nextInt();
         if(x>dp[max])
         System.out.println("-1");
         
         else
         {    
            int se=mysearch(a,x);
            System.out.println(se);
         }
         
     }
     
  }
}
