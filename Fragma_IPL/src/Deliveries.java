class Deliveries {
	int match_id;
	int inning;
	String batting_team;
	String bowling_team;
	int over;
	int ball;
	String batsman;
	String bowler;
	int wide_runs;
	int bye_runs;
	int legbye_runs;
	int penelty_runs;
	int batsman_runs;
	int extra_runs;
	int total_runs;
	
	public Deliveries() {
		super();
	}
 
	public Deliveries(String l) {
		super();
		String s[]=l.split(",");
		this.match_id = Integer.valueOf(s[0]);
		this.inning = Integer.valueOf(s[1]);
		this.batting_team = s[2];
		this.bowling_team = s[3];
		this.over = Integer.valueOf(s[4]);
		this.ball = Integer.valueOf(s[5]);
		this.batsman = s[6];
		this.bowler = s[7];
		this.wide_runs = Integer.valueOf(s[8]);
		this.bye_runs = Integer.valueOf(s[9]);
		this.legbye_runs = Integer.valueOf(s[10]);
		this.penelty_runs = Integer.valueOf(s[11]);
		this.batsman_runs = Integer.valueOf(s[12]);
		this.extra_runs = Integer.valueOf(s[13]);
		this.total_runs = Integer.valueOf(s[14]);
	}
	
	//getter and setter 
	

	@Override
	public String toString() {
		return "Deliveries [match_id=" + match_id + ", inning=" + inning + ", batting_team=" + batting_team
				+ ", bowling_team=" + bowling_team + ", over=" + over + ", ball=" + ball + ", batsman=" + batsman
				+ ", bowler=" + bowler + ", wide_runs=" + wide_runs + ", bye_runs=" + bye_runs + ", legbye_runs="
				+ legbye_runs + ", penelty_runs=" + penelty_runs + ", batsman_runs=" + batsman_runs + ", extra_runs="
				+ extra_runs + ", total_runs=" + total_runs + "]";
	}

	public int getMatch_id() {
		return match_id;
	}

	public void setMatch_id(int match_id) {
		this.match_id = match_id;
	}

	public int getInning() {
		return inning;
	}

	public void setInning(int inning) {
		this.inning = inning;
	}

	public String getBatting_team() {
		return batting_team;
	}

	public void setBatting_team(String batting_team) {
		this.batting_team = batting_team;
	}

	public String getBowling_team() {
		return bowling_team;
	}

	public void setBowling_team(String bowling_team) {
		this.bowling_team = bowling_team;
	}

	public int getOver() {
		return over;
	}

	public void setOver(int over) {
		this.over = over;
	}

	public int getBall() {
		return ball;
	}

	public void setBall(int ball) {
		this.ball = ball;
	}

	public String getBatsman() {
		return batsman;
	}

	public void setBatsman(String batsman) {
		this.batsman = batsman;
	}

	public String getBowler() {
		return bowler;
	}

	public void setBowler(String bowler) {
		this.bowler = bowler;
	}

	public int getWide_runs() {
		return wide_runs;
	}

	public void setWide_runs(int wide_runs) {
		this.wide_runs = wide_runs;
	}

	public int getBye_runs() {
		return bye_runs;
	}

	public void setBye_runs(int bye_runs) {
		this.bye_runs = bye_runs;
	}

	public int getLegbye_runs() {
		return legbye_runs;
	}

	public void setLegbye_runs(int legbye_runs) {
		this.legbye_runs = legbye_runs;
	}

	public int getPenelty_runs() {
		return penelty_runs;
	}

	public void setPenelty_runs(int penelty_runs) {
		this.penelty_runs = penelty_runs;
	}

	public int getBatsman_runs() {
		return batsman_runs;
	}

	public void setBatsman_runs(int batsman_runs) {
		this.batsman_runs = batsman_runs;
	}

	public int getExtra_runs() {
		return extra_runs;
	}

	public void setExtra_runs(int extra_runs) {
		this.extra_runs = extra_runs;
	}

	public int getTotal_runs() {
		return total_runs;
	}

	public void setTotal_runs(int total_runs) {
		this.total_runs = total_runs;
	}
}
