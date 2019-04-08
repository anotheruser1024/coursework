package rugbyTeam;

import java.util.ArrayList;

public class PLayers {
private static ArrayList<Player>entries;
	
	public PLayers() {
		setEntries(new ArrayList<Player>());
		
	}
	public void add( String teamName, String stadiumName,String teamID,String playerID,String playerName,int careerTries ) {
	getEntries().add(new Player(teamName, stadiumName, teamID, playerID, playerName, careerTries));
	
	}
	public static ArrayList<Player> getEntries() {
		return entries;
	}
	public void setEntries(ArrayList<Player> entries) {
		this.entries = entries;
	}

}