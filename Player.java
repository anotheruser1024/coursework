package rugbyTeam;

import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {
	
	
	private String teamName;
	private String stadiumName;
	private int teamID;
	private String playerID;
	private String playerName;
	private int careerTries;
	
	public Player(int teamID, String teamName, String stadiumName,String playerID,String playerName,int careerTries) {
		this.teamID = teamID;
		this.teamName = teamName;		
		this.stadiumName = stadiumName;		
		this.setPlayerID(playerID);
		this.playerName = playerName;
		this.setCareerTries(careerTries);
		
		// TODO Auto-generated constructor stub
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
	
	public static void main(String[] args) {
		Player player1 = new Player(1, "Team1", "stadium1", "RUF12345", "John Do", 1);
		// TODO Auto-generated method stub
		System.out.println(player1.playerID);
	}

	public String getplayerID() {
		// TODO Auto-generated method stub
		return playerID;
	}

	public int getCareerTries() {
		return careerTries;
	}

	public void setCareerTries(int careerTries) {
		
		if(getCareerTries() >= 1){
			this.careerTries += careerTries;
			System.out.println(getCareerTries());
			
		}else {
			this.careerTries = careerTries;
		}
	}
}


