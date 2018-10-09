
import java.util.*;

public class TestClass {
    public static void main(String args[] ) throws Exception {
    Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    
    while(t-->0)
    { 
        //Activity obj=new Activity();
        ArrayList<Activity> l=new ArrayList<Activity>();
        int n=scan.nextInt();
        int start,end;
        for(int i=0;i<n;i++)
        {
            start=scan.nextInt();
            end=scan.nextInt();
            l.add(new Activity(start,end));
        }
        Collections.sort(l,new MyComparator());
      //  System.out.println(l.toString());
        ArrayList<Activity> l2=new ArrayList<Activity>();
        l2.add(l.get(0));
       // Activity x=new Activity();
       // x.setStart(l.get(0));
        
        for(int i=0;i<l.size();i++)
        {
        	int s=l2.size()-1;
        	Activity cl=l.get(i);
        	Activity cl2=l2.get(s);
        	if(cl.start>=cl2.end)
        	{
        		l2.add(l.get(i));
        	}
        	

        }
       
        System.out.println(l2);
       int si=l2.size();
       
        int Alice=si/2+si%2;
        int Bob=si/2;
        Alice=Alice^1;
        //System.out.println("Alice: "+ Alice+"Bob "+Bob);
        if(Alice>Bob)
        	System.out.println("Alice");
        else if(Bob>Alice)
        	System.out.println("Bob");
        else
        	System.out.println("Tie");
        
    }
  // System.out.println("Alice");
    }
}
class Activity{
    int start;
    int end;
    Activity()
    {
        
    }
   
    
	public Activity(int start, int end) {
		super();
		this.start = start;
		this.end = end;
	}
	@Override
	public String toString() {
		return "Activity [start=" + start + ", end=" + end + "]";
	}


	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}
	
    
}
class MyComparator implements Comparator{
   public int compare(Object o1,Object o2)
   {
       Activity v1=(Activity)o1;
       Activity v2=(Activity)o2; 
       int x=(int)v1.end;
       int y=(int)v2.end;
       if(y<x)
    	   return 1;
       return -1;
    			   
   }
}