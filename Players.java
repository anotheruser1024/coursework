package rugbyTeam;

import java.util.ArrayList;

public class Players {
	private static ArrayList<Player>entries;
	
	
		
	
	public Players( ) {
        entries = new ArrayList<Player>();
    }
	public void add( String teamName, String stadiumName,String teamID,String playerID,String playerName,int careerTries ) {
	getEntries().add(new Player(teamName, stadiumName, teamID, playerID, playerName, careerTries));
	
	}
	
	
	private ArrayList<Player> getEntries() {
		// TODO Auto-generated method stub
		return null;
	}
	public String findString( String toFind ) {
        for (Player item:entries) {
            if (item.getPlayerName().equals(toFind) ) {
                return item.getPlayerName();
            }
        }
        return "NOT FOUND";
    }
	
	

}