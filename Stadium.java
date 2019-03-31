package rugbyTeam;

import java.util.regex.Pattern;

public class Stadium {
	private String stadiumName;
	private String stadiumStreet;
	private String stadiumTown;
	private String stadiumPostCode;
	
	
	
	//setters
	public void setStadiumName(String stadiumName) {
		this.stadiumName = stadiumName;
	}
	
	public void setStadiumStreet(String stadiumStreet) {
		this.stadiumStreet = stadiumStreet;
	}
	
	public void setStadiumTown(String stadiumTown) {
		this.stadiumTown = stadiumTown;
	}
	
	
	
	public void setStadiumPostCode(String stadiumPostCode) throws Exception {
		if(Pattern.matches("^[A-Z]{1,2}[0-9]{1,2}[A-Z]? [0-9][A-Z]{2}$",stadiumPostCode)) {
			this.stadiumPostCode = stadiumPostCode;
		}else {
			throw new Exception("Post code doesn't match from AA 11 9AA");
			
		}
		
		
	}
	
	
	//getters 
	public String getStadiumName() {
		return stadiumName;
	}

	public String getStadiumStreet() {
		return stadiumStreet;
	}

	public String getStadiumTown() {
		return stadiumTown;
	}

	public String getStadiumPostCode() {
		
		return stadiumPostCode;
	}

	

	



	
	
	
	
	
	

}
