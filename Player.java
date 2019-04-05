package rugbyTeam;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {
	
	
	private String teamName;
	private String stadiumName;
	
	private String playerID;
	private String playerName;
	private int careerTries;
	
	public Player(String teamName, String stadiumName,String playerID,String playerName,int careerTries) {
		
		this.teamName = teamName;		
		this.stadiumName = stadiumName;		
		this.setPlayerID(playerID);
		this.setPlayerName(playerName);
		this.setCareerTries(careerTries);
		
		// TODO Auto-generated constructor stub
	}
	
	public String getPlayerName() {
		return playerName;
	}
	
	public int getCareerTries() {
		return careerTries;
	}
	
	public String getplayerID() {
		// TODO Auto-generated method stub
		return playerID;
	}
	
	
	public void setPlayerID(String playerID) {
		if(Pattern.matches("RUF[0-9][0-9][0-9][0-9][0-9]", playerID)) {
			//check if player format is RUF then 5 digits
			
			this.playerID = playerID;
			
		} else {
			//returns value error
			System.out.println("Check entry");			
		}
	}
	
	





	public void setCareerTries(int careerTries) {
		
		if(getCareerTries() >= 1){
			this.careerTries += careerTries;
			System.out.println(getPlayerName() +"'s " + "career tries to date: " +getCareerTries());
			
		}else {
			
			this.careerTries = careerTries;
		}
	}



	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	//--MAIN--
	public static void main(String[] args) {
		Player player1 = new Player("Team1", "stadium1", "RUF12345", "John Do", 1);
		// TODO Auto-generated method stub
		System.out.println(player1.playerID);
	}
}


