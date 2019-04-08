package rugbyTeam;
import java.util.Scanner;

public class UX {
	static Scanner scanner = new Scanner(System.in);
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
		select = scanner.nextInt();
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
		    
		    while (!scanner.hasNextInt()) {
		        System.out.println("That's not a number!");
		        scanner.next(); // this is important!
		    }
		    number = scanner.nextInt();
		} while (number <= 0);
		return number;
		
	}
	public static String inputPlayerID() {
		String playerID;
		while(!scanner.hasNext("RUF[0-9][0-9][0-9][0-9][0-9]")){
			System.out.println("Please enter player ID with Prefix RUF followed by 5 didgits");
			scanner.next();
	}
	playerID = scanner.nextLine();
	return playerID;
	}
	
	public static String inputName() {
		//local variables for method 
		String firstName;
		String surName;
		String playerName;
		
		System.out.println("please enter Player's First name: ");
		//checks if input is letters not numbers 
		while(!scanner.hasNext("[A-Za-z]+")){
			System.out.print(" Oops!! names can't have numbers");
			scanner.next();
			
		}
		firstName = scanner.nextLine();
		//.append(scanner.nextLine());
		scanner.reset();
		 
		System.out.println("Enter player's Surname: ");
		while(!scanner.hasNext("[A-Za-z]+")){
			System.out.print("Oops!! Names cant contain numbers");
			scanner.next();
		}
		
		surName = scanner.nextLine();
		while(firstName.equals(surName) ) {
			System.out.println("Oops!! first and last name cant be the same");
			surName = scanner.next();			
		}
		
		playerName = (firstName +" " + surName);
		playerName = playerName.toLowerCase();
		
		return playerName;
	}
	
	public static String checkIsStr(){
		String str;
		//checks if input is letters not numbers 
		while(!scanner.hasNext("[A-Za-z]+")){
			System.out.print(" Oops!! names can't have numbers");
			scanner.next();		
		}
		str = scanner.nextLine();
		//.append(scanner.nextLine());
		scanner.reset();
		return str;
	}
	
	
	public static void classPlayerNew() {
		String playerID;
		String stadiumName;
		String playerName;
		String teamName;
		int careerTries;
		String name;
		
		
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
		name = playerID;
		Player name = new Player(teamName, stadiumName, playerID, playerName, careerTries);
		
		

		
	}
	
	
	
}

