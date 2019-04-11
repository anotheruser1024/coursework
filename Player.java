package rugbyTeam;

import java.util.regex.Pattern;

import java.util.ArrayList;

public class Player {
	
	
	private String teamName;
	private String stadiumName;
	private String teamID;
	private String playerID;
	private String playerName;
	private Integer careerTries;
	private String stadiumStreet;
	private String stadiumTown;
	private String stadiumPostCode;
		
		
		
		//setters		
	
		
		
		

	
	public Player(String teamName, String stadiumName,String teamID,String playerID,String playerName,Integer careerTries,String stadiumStreet,String stadiumTown,String stadiumPostCode) {
		
		this.setTeamName(teamName);		
		this.setStadiumName(stadiumName);
		this.setTeamID(teamID);
		this.setPlayerID(playerID);
		this.setPlayerName(playerName);
		this.setCareerTries(careerTries);		
		this.setStadiumStreet(stadiumStreet);
		this.setStadiumTown(stadiumTown);
		this.setStadiumPostCode(stadiumPostCode);
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
	
	public Integer getCareerTries() {
		return careerTries;
	}
	public String getTeamName() {
		return teamName;
	}
	
	public String getTeamID() {
		return teamID;
	}
	public String getStadiumStreet(){
		return stadiumStreet;
	}
	public String getStadiumTown() {
		return stadiumTown;
	}
	public String getStadiumPostCode() {
		return stadiumPostCode;
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
	
	public void setTeamID(String teamID) {
		// TODO Auto-generated method stub
		this.teamID = teamID;
	}
	
	public void setPlayerID(String playerID)  throws IllegalArgumentException{
		if(Pattern.matches("RUF[0-9]{5}", playerID) && !Players.existingplayerID(playerID) ) {
			//check if player format is RUF then 5 digits
			
			this.playerID = playerID;
			
		} else {
			//returns value error
			throw new IllegalArgumentException("Invalid ID check format RUF12345 RUF then 5 numbers \nOR\n player ID already in use");			
		}
	}
	
	public void setCareerTries(Integer careerTries) {
		
			this.careerTries = careerTries;
		
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
	
	public void setStadiumPostCode(String stadiumPostCode)  throws IllegalArgumentException {
		if(Pattern.matches("^[A-Z]{1,2}[0-9]{1,2}[A-Z]? [0-9][A-Z]{2}$",stadiumPostCode)) {
			this.stadiumPostCode = stadiumPostCode;
		}else {
			
			throw new IllegalArgumentException("Post code doesn't match from AA 11 9AA");
		}
}
	
	public void setStadiumTown(String stadiumTown) {
		this.stadiumTown = stadiumTown;
	}

	public void setStadiumStreet(String stadiumStreet) {
		// TODO Auto-generated method stub
		
	}	
	//--MAIN--
	
	
	
	
	//--player instance add to array
	
	public static void main(String[] args) {

		
	}
}



