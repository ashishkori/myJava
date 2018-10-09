package IPL;

import java.util.Scanner;
class IPL {
	int match_id;
	int season;
	String city;
	String date;
	String team1;
	String team2;
	String toss_winner;
	String toss_dicision;
	String reault;
	String winner;
	
	public IPL(String l) {
		super();
		String s[]=l.split(",");
		this.match_id = Integer.valueOf(s[0]);
		this.season = Integer.valueOf(s[1]);
		this.city = s[2];
		this.date = s[3];
		this.team1 = s[4];
		this.team2 = s[5];
		this.toss_winner = s[6];
		this.toss_dicision = s[7];
		this.reault = s[8];
		this.winner = s[9];
		}
	
}

public class IPL{
	
}