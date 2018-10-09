package com.IPL;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;


class Record
{
	String no;
	String year;
	String team;
	String choice;
	
	Record(String no,String year, String team, String choice)
	{
		this.no = no;
		this.year=year;  
		this.team=team;  
		this.choice=choice;
	}
}
public class CSVRead {

	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "DataSet/matches.csv";
		File file = new File(fileName);
		Scanner scan = new Scanner(file);
		int sum = 0;
		Map<String,Integer> table = new HashMap<>();
		Map<String,Integer> map = new HashMap<>();
		ArrayList<Record> al = new ArrayList<>();
		ArrayList<Record> a2 = new ArrayList<>();
		String data = scan.nextLine();
		int i=0;
		while(scan.hasNext())
		{ 	i++;
			data = scan.nextLine();
			String[] arr = data.split(",");
			
			if(arr[1].equals("2017"))
				al.add(new Record(arr[0],arr[1],arr[6],arr[7]));
			
			if(arr[1].equals("2016"))
				a2.add(new Record(arr[0],arr[1],arr[6],arr[7]));
		}
		Iterator itr=al.iterator();  
		System.out.println(i);;
		 while(itr.hasNext())
		 {
			 Record st = (Record)itr.next();
			 if(!table.containsKey(st.team) && st.choice.equals("field"))
			 {
				 table.put(st.team, 1);
			 }
			 else if(st.choice.equals("field"))
			 {
				 table.put(st.team, table.get(st.team)+1);
			 }
		 }
		 Iterator it=a2.iterator();  
			
		 while(it.hasNext())
		 {
			 Record st = (Record)it.next();
			 if(!map.containsKey(st.team) && st.choice.equals("field"))
			 {
				 map.put(st.team, 1);
			 }
			 else if(st.choice.equals("field"))
			 {
				 map.put(st.team, map.get(st.team)+1);
			 }
		 }
		 List<Entry<String, Integer>> list1 = abcd(map);
		 Set<Entry<String, Integer>> set = table.entrySet();
	        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
	        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
	        {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	                return (o2.getValue()).compareTo( o1.getValue() );
	            }
	        } );
		
	        System.out.println("YEAR |  TEAM \t\t | COUNT");
	        int count = 0;
	        for(Map.Entry m:list1)
	    	{
	    		if(count == 4)
	    			break;
	    		else{
	    		
	    		System.out.println("2016 |" + m.getKey()+"\t: "+m.getValue());
	    		count++;
	    		}
	    	}
		
        
		count = 0;
		for(Map.Entry m:list)
		{
			if(count == 4)
				break;
			else{
			System.out.println("2017 |" + m.getKey()+" \t: "+m.getValue());
			count++;
			}
		}

	}

	public static List<Entry<String, Integer>> abcd(Map<String, Integer> map) {
		Set<Entry<String, Integer>> set1 = map.entrySet();
	        List<Entry<String, Integer>> list1 = new ArrayList<Entry<String, Integer>>(set1);
	        Collections.sort( list1, new Comparator<Map.Entry<String, Integer>>()
	        {
	            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
	            {
	                return (o2.getValue()).compareTo( o1.getValue() );
	            }
	        } );
		return list1;
	}

}
