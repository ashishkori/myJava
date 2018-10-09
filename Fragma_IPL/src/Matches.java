import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.*;

class Matches {
	// MATCH_ID	SEASON	CITY	DATE	TEAM1	
	//TEAM2	TOSS_WINNER	TOSS_DECISION	RESULT	WINNER

	int match_id;
	int season;
	String city;
	String date;
	String team1;
	String team2;
	String toss_winner;
	String toss_dicision;
	String result;
	String winner;
	
	public Matches() {
		super();
	}
	public Matches(String l)  {
		super();
		
		String s[]=l.split(",");
		this.match_id = Integer.valueOf(s[0]);
		this.season = Integer.valueOf(s[1]);
		this.city = s[2].trim();
		this.date = s[3].trim();
		this.team1 = s[4].trim();
		this.team2 = s[5].trim();
		this.toss_winner = s[6].trim();
		this.toss_dicision = s[7].trim();
		this.result = s[8].trim();
		if(s.length==10)
		this.winner = s[9].trim();
		else
			this.winner = "No Result";	
		//this.toString();
	}
	@Override
	public String toString() {
		return "Matches [match_id=" + match_id + ", season=" + season + ", city=" + city + ", date=" + date + ", team1="
				+ team1 + ", team2=" + team2 + ", toss_winner=" + toss_winner + ", toss_dicision=" + toss_dicision
				+ ", result=" + result + ", winner=" + winner + "]";
	}
	public int getMatch_id() {
		return match_id;
	}
	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}
	public int getSeason() {
		return season;
	}
	public void setSeason(int season) {
		this.season = season;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTeam1() {
		return team1;
	}
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	public void setTeam2(String team2) {
		this.team2 = team2;
	}
	public String getToss_winner() {
		return toss_winner;
	}
	public void setToss_winner(String toss_winner) {
		this.toss_winner = toss_winner;
	}
	public String getToss_dicision() {
		return toss_dicision;
	}
	public void setToss_dicision(String toss_dicision) {
		this.toss_dicision = toss_dicision;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getWinner() {
		return winner;
	}
	public void setWinner(String winner) {
		this.winner = winner;
	}
	
	public static void selectField(ArrayList<Matches> match, int year,int top_teams )
	{
		HashMap<String, Integer> map=new HashMap<String, Integer>();
		//System.out.println("YEAR| TEAM |COUNT");
		Iterator<Matches> itr=match.iterator();
		while(itr.hasNext())
		{
			Matches m=(Matches)itr.next();
			if(m.getSeason()==year && m.getToss_dicision().equals("field"))
			{
				//System.out.println(m.toString());
				String t=m.getToss_winner();
				if(map.containsKey(t))
				{
					map.put(t, map.get(t)+1);
				}
				else
					map.put(t, 1);
			}
				
			
		}
		//
		Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
            	return o2.getValue().compareTo(o1.getValue());
            	
                 
            }
        } );
        
        for(Map.Entry<String, Integer> e : list)
        {
        	if(top_teams--!=0)
        	{
        		 //String.("My Company name is %s", str);
        		 System.out.printf("|%5d |%25s |%5d|",year,e.getKey(),e.getValue()).println();
        		 System.out.println("-----------------------------------------");
        		 
        	}
        		
        	else
        		break;
        }
	}


}
