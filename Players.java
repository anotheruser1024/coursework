package rugbyTeam;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Players {
	private static ArrayList<Player>entries;
	
	
		
	
	public Players( ) {
        entries = new ArrayList<Player>();
    }
	
	public void add( String teamName, String stadiumName,String teamID,String playerID,String playerName,int careerTries ) {
	entries.add(new Player(teamName, stadiumName, teamID, playerID, playerName, careerTries));
	
	}
	
	public static ArrayList<Player> getEntries() {
		return entries;
	}
	
	public static void addNewPlayer(String teamName, String stadiumName,String teamID,String playerID,String playerName,int careerTries ){
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
            if (item.getPlayerID().equals(playerID) ) {
                return true;
            }
        }
        return false;
	}
	
	
    public static void save(String path) throws IOException {

            // Save each student as a new line in a .tsv style file
            PrintWriter writer = new PrintWriter(path, "UTF-8");
            for (Player item:entries) {
                writer.println(item.getTeamName() + "\t" + item.getStadiumName() + "\t" + item.getTeamID() + "\t" + item.getPlayerID() + "\t" + item.getPlayerName() + "\t" +  item.getCareerTries());
            
            writer.close();
        }
    }	
    public static void loadFile(String filePath)throws Exception {
	    BufferedReader reader = new BufferedReader(new FileReader(filePath)); 
	    ArrayList<String> listOfLines = new ArrayList<>();
	    String line = reader.readLine();
	    while (line != null) {
	    	listOfLines.add(line);
	    	line = reader.readLine();
	    } 
	    reader.close();
	    System.out.println("Content of ArrayLiList:"); 
	    System.out.println(listOfLines);
	
	    
    }
}

    
	
	

