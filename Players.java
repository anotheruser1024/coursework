package rugbyTeam;

import java.util.ArrayList;


public class Players {
	private static ArrayList<Player>entries;
	
	
		
	
	public Players( ) {
        entries = new ArrayList<Player>();
    }
	
	public void add( String teamName, String stadiumName,String teamID,String playerID,String playerName,Integer careerTries ) {
	entries.add(new Player(teamName, stadiumName, teamID, playerID, playerName, careerTries));
	
	}
	
	public static void addNewPlayer(String teamName, String stadiumName,String teamID,String playerID,String playerName,Integer careerTries ){
		//
		Players pl = new Players();
		pl.add(teamName, stadiumName, teamID, playerID, playerName, careerTries);
		int i = entries.size() -1;
		System.out.println("New player added\n" + entries.get(i).getPlayer());
	}
	
	

	
	public static String findPlayerByName( String toFind ) {
        toFind = toFind.toLowerCase();
		for (Player item:entries) {
            if (item.getPlayerName().equals(toFind) ) {
                return item.getPlayer();
            }
        }
        return "NOT FOUND";
    }
	
	public static void removeByIndex(int playerIndex){
		playerIndex -=1;
		entries.remove(playerIndex); 
	}

	
	public static int findItem( String toFind ) {
		
        for (Player item:entries) {
            if (item.getPlayerName().equals(toFind) ) {
                int rm = entries.indexOf(item);
                return rm + 1;
            }
        }
        return -1;
    }
	public static boolean existingplayerID(String playerID) {
		for (Player item:entries) {
            if (item.getplayerID().equals(playerID) ) {
                return true;
            }
        }
        return false;
	}
	
	


	
	

}