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
		System.out.println("Enter "+ className +"'s "+ field+": ");		
		
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
	
	
	
}

