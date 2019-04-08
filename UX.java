package rugbyTeam;
import java.util.Scanner;

public class UX {
	static Scanner input = new Scanner(System.in);
	static Players pl = new Players();
	public static void welcome() {
		System.out.println("---WELCOME---");
		System.out.println("Welcom to player manager app");		
	}
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	public static void printfirstMenu() {
		
		System.out.println("What would you like to do today?");		
		System.out.println("1:Add New Player/n2: Edit Player /n3: View Existing player");
		
		int select;
		select = input.nextInt();
		System.out.println(select);
		
		
	}
	
	public static void printAddMenu() {
		clearScreen();
		System.out.println("---ADD NEW PLAYER---");		
	}
	public static void printEditMenu() {
		clearScreen();
		System.out.println("---EDIT EXISTING PLAYER--");
		
	}
	
	public static void printConfrim() {
		System.out.println("---CONFIRM---");
		System.out.println("Enter YES or Y, if correct /n Or");
		System.out.println("Enter NO or N");
		
		
	}
	public static void printField(String className, String field) {
		System.out.println("---Enter---");
		System.out.println("Plaese Enter "+ className +"'s "+ field+": ");		
		
	}
	public static  int checkIsInt() {
		
		int number;
		do {
		    
		    while (!input.hasNextInt()) {
		        System.out.println("That's not a number!");
		        input.next(); // this is important!
		    }
		    number = input.nextInt();
		} while (number <= 0);
		return number;
		
	}
	public static String inputPlayerID() {
		String playerID;
		while(!input.hasNext("RUF[0-9][0-9][0-9][0-9][0-9]")){
			System.out.println("Please enter player ID with Prefix RUF followed by 5 didgits");
			input.next();
	}
	playerID = input.nextLine();
	return playerID;
	}
	
	public static String inputName() {
		//local variables for method 
		String firstName = null;
		String surName=null;
		String playerName=null;
		
		System.out.println("please enter Player's First name: ");
		//checks if input is letters not numbers 
		while(!input.hasNext("[A-Za-z]+")){
			System.out.print(" Oops!! names can't have numbers");
			input.next();
			
		}
		firstName = input.nextLine();
		//.append(scanner.nextLine());
		input.reset();
		 
		System.out.println("Enter player's Surname: ");
		while(!input.hasNext("[A-Za-z]+")){
			System.out.print("Oops!! Names cant contain numbers");
			input.next();
		}
		
		surName = input.nextLine();
		while(firstName.equals(surName) ) {
			System.out.println("Oops!! first and last name cant be the same");
			surName = input.next();			
		}
		
		playerName = (firstName +" " + surName);
		playerName = playerName.toLowerCase();
		
		return playerName;
	}
	
	public static String checkIsStr(){
		String str =null;
		//checks if input is letters not numbers 
		while(!input.hasNext("[A-Za-z]+")){
			System.out.print(" Oops!! names can't have numbers");
			input.next();		
		}
		str = input.nextLine();
		
		input.reset();
		return str;
	}
	
	
	public static void PlayerNew() {
		String playerID =null;
		String stadiumName=null;
		String playerName=null;
		String teamName=null;
		Integer careerTries=null;
		
		String teamID=null;
		
		
		clearScreen();
		printAddMenu();
		playerName = inputName();
		printField("player", "player ID");
		playerID = inputPlayerID();
		printField("player", "career Tries");
		careerTries = checkIsInt();
		printField("player", "Team name");
		teamName = checkIsStr();
		printField("player", "Stadium");
		
		stadiumName = checkIsStr();
		
		teamID = "123434";
		
		
		pl.add(teamName, stadiumName,teamID, playerID, playerName, careerTries);
		pl.
		
		

		
	}
	
	
	
}

