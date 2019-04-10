package rugbyTeam;

import java.util.regex.Pattern;

import java.util.ArrayList;

public class Player {
	
	
	private String teamName;
	private String stadiumName;
	private String teamID;
	private String playerID;
	private String playerName;
	private int careerTries;
	
	public Player(String teamName, String stadiumName,String teamID,String playerID,String playerName,int careerTries) {
		
		this.setTeamName(teamName);		
		this.setStadiumName(stadiumName);
		this.setTeamID(teamID);
		this.setPlayerID(playerID);
		this.setPlayerName(playerName);
		this.setCareerTries(careerTries);
		
		// TODO Auto-generated constructor stub
	}

	
	public Player() {
		;
	}
	
	

	public String getPlayerID() {
		return playerID;
	}
	
	public String getStadiumName() {
		
		return stadiumName;
	}

	public String getPlayerName() {
		
		return playerName;
	}
	
	public int getCareerTries() {
		return careerTries;
	}
	public String getTeamName() {
		return teamName;
	}
	
	public String getTeamID() {
		return teamID;
	}
	
	
	public String getPlayer() {
		String player = "\t\t ----PLayer Details---"+
						"\n Name: " + Main.capitailizeWord(playerName)
						+"\n Player ID: "+ playerID
						+"\n Team: " + Main.capitailizeWord(teamName)
						+"\n Home Stadium:" + Main.capitailizeWord(stadiumName)
						+"\n Players career tries: " + careerTries;
						;
		
		return player;
	}
	
	
	//--Setters--
	
	private void setTeamID(String teamID) {
		// TODO Auto-generated method stub
		this.teamID = teamID;
	}
	
	public void setPlayerID(String playerID)  throws IllegalArgumentException{
		if(Pattern.matches("RUF[0-9]{5}", playerID) && !Players.existingplayerID(playerID)) {
			//check if player format is RUF then 5 digits
			
			this.playerID = playerID;
			
		} else {
			//returns value error
			throw new IllegalArgumentException("Invalid ID check format RUF12345 RUF then 5 numbers \nOR\n player ID already in use");			
		}
	}
	
	public void setCareerTries(int careerTries) {
		
		if(getCareerTries() >= 1){
			this.careerTries += careerTries;
			System.out.println(getPlayerName() +"'s " + "career tries to date: " +getCareerTries());
			
		}else{
			
			this.careerTries = careerTries;
		}
	}

	public void setStadiumName(String stadiumName) {
		// TODO Auto-generated method stub
		this.stadiumName = stadiumName;
	}
	


	public void setPlayerName(String playerName) {
		this.playerName = playerName.toLowerCase();
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	//--MAIN--
	
	
	
	
	//--player instance add to array
	
	public static void main(String[] args) {

		
	}
}



