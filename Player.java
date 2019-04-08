package rugbyTeam;

import java.util.regex.Pattern;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public class Player {
	
	
	private String teamName;
	private String stadiumName;
	private String teamID;
	private String playerID;
	private String playerName;
	private int careerTries;
	
	public Player(String teamName, String stadiumName,String teamID,String playerID,String playerName,int careerTries) {
		
		this.teamName = teamName;		
		this.setStadiumName(stadiumName);
		this.setTeamID(teamID);
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
	
	
	//--Setters--
	
	private void setTeamID(String teamID2) {
		// TODO Auto-generated method stub
		
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

	private void setStadiumName(String stadiumName2) {
		// TODO Auto-generated method stub
		
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	
	//--MAIN--
	
	
	
	
	//--player instance add to array
	
	public static void main(String[] args) {

		
	}
}



