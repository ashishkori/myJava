package ;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Matches {
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
	//private static Scanner scan;
	
	
	
	

	public Matches(String l)  {
		//super();
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
	@Override
	public String toString() {
		return "Matches [match_id=" + match_id + ", season=" + season + ", toss_winner=" + toss_winner
				+ ", toss_dicision=" + toss_dicision + "]";
	}


public static void main(String[] args) {
	ArrayList<Matches> match=new ArrayList<Matches>();
	
	String fileName = "Dataset/matches.csv";
	File file = new File(fileName);
	Scanner scan = new Scanner(file);
	String data=scan.nextLine();;
	int i=0;
	
	while(scan.hasNext())
	{
		i++;
		data=scan.nextLine();
		match.add(new Matches(data));
		
	}
	System.out.println(i);
}

}
