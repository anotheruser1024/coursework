package rugbyTeam;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;


public class Players {
	
	private static ArrayList<Player>entries;
	
	private static Players pl = new Players();
		
	
	public Players( ) {
        entries = new ArrayList<Player>();
    }
	
	public void add( String teamName, String stadiumName,String teamID,String playerID,String playerName,Integer careerTries,String stadiumStreet,String stadiumTown,String stadiumPostCode ) {
	entries.add(new Player(teamName, stadiumName, teamID, playerID, playerName, careerTries,stadiumStreet, stadiumTown, stadiumPostCode));
	
	}
	
	public static ArrayList<Player> getEntries() {
		return entries;
	}
	public static String getplayerByindex(int index) {
		return entries.get(index).getPlayer();
	}
	
	public static void addNewPlayer(String teamName, String stadiumName,String teamID,String playerID,String playerName,Integer careerTries,String stadiumStreet,String stadiumTown,String stadiumPostCode ){
		//
		
		pl.add(teamName, stadiumName, teamID, playerID, playerName, careerTries, stadiumStreet, stadiumTown, stadiumPostCode);
		
		System.out.println("New player added\n");
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
		
		entries.remove(playerIndex); 
	}

	
	public static int findPlayersIndex( String toFind ) {
		
        for (Player item:entries) {
            if (item.getPlayerID().equals(toFind) ) {
                int rm = entries.indexOf(item);
                return rm;
            }
        }
        return -1;
    }
	public static boolean existingplayerID(String playerID) {
		if(entries.size() == 0) {
			return false;
		}else {
		for (Player item:entries) {
            if (item.getPlayerID().equals(playerID) ) {
                return true;
            }
        }
        return false;}
	}
	
	
    public static void save(String path) throws IOException {

            // Save each student as a new line in a .tsv style file
            FileWriter FW = new FileWriter(path);
            Writer output = new BufferedWriter(FW);
            for (Player item:entries) {
                output.write(item.getTeamName() +"\t"+item.getStadiumName()+ "\t"+item.getTeamID()+"\t"+item.getPlayerID()+"\t"+item.getPlayerName()+"\t"+item.getCareerTries()+ "\n");
            
            
        }
        output.close();
    }	
    
    public static void loadFile(String filePath)throws Exception {
	    BufferedReader reader = new BufferedReader(new FileReader(filePath)); 
	    String line = reader.readLine();
	    List<String> listOfLines = new ArrayList<String>(Arrays.asList());
	    try {
		    if(!reader.ready()) {
		    	throw new IOException("NO players loaded");//checks whether file is ready to read
		    }
		    while (line != null) {
		    	List<String> values = new ArrayList<String>(Arrays.asList(line.split("\t")));
		    	
                Players.addNewPlayer(values.get(0), values.get(1), values.get(2), values.get(3), values.get(4),Integer.parseInt(values.get(5)),values.get(6),values.get(7),values.get(8));
                
		    	
		    	line = reader.readLine();
		    	
		    }
	    }catch(IOException e){
	    	System.out.println(e);
	    	
	    }
	    reader.close();
	    for(String item:listOfLines) {
	    	System.out.println(item);
	    }
	    System.out.println("Content of ArrayLiList:"); 
	    System.out.println(listOfLines);
	
	    
    }
}

    
	
	

