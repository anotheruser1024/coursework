package rugbyTeam;
import java.util.ArrayList;
import java.util.Scanner;

public class UX {
	static Scanner input = new Scanner(System.in);
	
/*	
 * code index 
 * line 16 menu print helper methods  
 * line 56 menu input helper methods 
 * line 77 menu methods 
 * 
 */
	
// menu print helper methods 
	public static void printsearch() {
		printFindPlayer();
		System.out.println("\n\t 1: Seach for player by name \n\t 2: lucky search \n\t 3:search by stadium ");
		
	}
	
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
		System.out.println("1:Add New Player\n2: Delete Player \n3: Search Existing players \n4:View all players\n5 Exit program");
				
	}
	
	public static void printAddMenu() {
		clearScreen();
		System.out.println("---ADD NEW PLAYER---");		
	}
	public static void printFindPlayer() {
		clearScreen();
		System.out.println("---SEARCH FOR PLAYERS--");
		
	}
	public static void printDelete() {
		System.out.println("---DELETE PLAYER---");
		
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
//input helper methods	
	
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
		playerID = input.next();
		return playerID;
	}
	
	public static String checkIsStr(){
		String str;
		//checks if input is letters not numbers 
		while(!input.hasNext("[A-Za-z]+")){
			System.out.print(" Oops!! names can't have numbers");
			input.next();		
		}
		str = input.nextLine();
		//.append(scanner.nextLine());
		
		return str;
	}
	
// player menu ux methods 
	
	public static String inputName() {
		//local variables for method 
		String firstName = null;
		String surName=null;
		String playerName=null;
		input.reset();
		System.out.println("please enter Player's First name: ");
		//checks if input is letters not numbers 
		while(!input.hasNext("[A-Za-z]+")){
			System.out.print(" Oops!! names can't have numbers");
			input.next();
			
		}
		firstName = input.next();
		//.append(scanner.nextLine());
		input.reset();
		
		System.out.println("Enter player's Surname: ");
		while(!input.hasNext("[A-Za-z]+")){
			System.out.print("Oops!! Names cant contain numbers");
			input.next();
		}
		
		surName = input.next();
		
		while(firstName.equals(surName) ) {
			System.out.println("Oops!! first and last name cant be the same");
			surName = input.next();	
			
		}
		
		playerName = (firstName +" " + surName);
		playerName = playerName.toLowerCase();
		input.reset();
		return playerName;
	}
	
	
	public static void creatPlayerNew() {
		String playerID =null;
		String stadiumName=null;
		String playerName=null;
		String teamName=null;
		Integer careerTries=0;
		
		String teamID=null;
		Player player = new Player();
        while (true) {
            try {
                
                playerName = inputName();
                player.setPlayerName(playerName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
            	printField( "player", "player ID");
                playerID = input.nextLine();
                player.setPlayerID(playerID);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
            	printField( "player", "Stadium Name");
                stadiumName = input.nextLine();
                player.setStadiumName(stadiumName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
       
        while (true) {
            try {
            	printField( "player", "team name");
                teamName = input.nextLine();
                player.setTeamName(teamName);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        while (true) {
            try {
            	printField( "player", "career tries");
                careerTries = checkIsInt();
                player.setCareerTries(careerTries);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
		
		Players.addNewPlayer(teamName, stadiumName,teamID, playerID, playerName, careerTries);
		
			
		}
		
		public static void findPlayer() {
			;//--TODO---
		}
		public static void findLucky(){
			;
		}
		public static void findStadium(){
			
		}
		
		public static void findPlayerOption() {
			int option;
			printFindPlayer();
			printsearch();
			System.out.println("Enter a number the number of next menu: ");
			option = checkIsInt();
			if( option < 5) {
				switch (option) {
					case 1:
						findPlayer();
						break;
					case 2:
						findLucky();
						break;
					case 3:
						findPlayerOption();
						break;
					case 4:
						printPlayers();
						break;
						
					}
			
			}else{
				System.out.print("Enter a Number corosponding to your choise: ");
				option= checkIsInt();
			}
			
		}
		
		
		public static void deletePlayer() {
			String playerID;
			int indexPlayer;
			String choise;
			
			printDelete();
			printField("player", "player id");
			playerID =  inputPlayerID();
			indexPlayer = Players.findPlayersIndex(playerID);
			if(indexPlayer != -1 ) {

				System.out.println("are you sure you sure you want to delete PLayer");
				System.out.print(Players.getplayerByindex(indexPlayer));
				printConfrim();
				choise = checkIsStr();
				if(choise == "yes" || choise == "y" || choise == "Yes" || choise == "Y") {
					Players.removeByIndex(indexPlayer);
					System.out.println("Player has been removed");
					System.out.println("Retruning to home screen");
					selectOptionHome();
				}
				System.out.println("Retruning to home screen");
				selectOptionHome();
				
			}else {
				System.out.println("Player Not found try print all players for correct player ID");
				selectOptionHome();
			}
			
			
		}
		
	
		public static void printPlayers() {
			ArrayList<Player>entries = Players.getEntries();
			for (Player item:entries) {
				System.out.println("-------------------");
				System.out.println(item.getPlayer());
				System.out.println("--------------------");
				
			}
			selectOptionHome();
			
		}
		
		public static void selectOptionHome() {
			int option;
			printfirstMenu();
			
			System.out.println("Enter a number the number of next menu: ");
			option = checkIsInt();
			if( option < 6) {
				switch (option) {
					case 1:
						creatPlayerNew();
						break;
					case 2:
						deletePlayer();
						break;
					case 3:
						findPlayerOption();
						break;
					case 4:
						printPlayers();
						break;
						
					}
			
			}else{
				System.out.print("Enter a Number corosponding to your choise: ");
				option= checkIsInt();
			}

		}
		
		

		
	}
	
	
	


