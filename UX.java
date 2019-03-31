package rugbyTeam;
import java.util.Scanner;

public class UX {
	static Scanner scanner = new Scanner(System.in);
	public static void welcome() {
		System.out.println("Welcom to player manager app");		
	}
	public static void clearScreen() {  
	    System.out.print("\033[H\033[2J");  
	    System.out.flush();  
	}  
	public static void printfirstMenu() {
		System.out.println("what would you like to do today?");
		System.out.println("1: Add new player");
		System.out.println("2: Edit Player");
		System.out.println("3: View Existing player");
		int select;
		select = scanner.nextInt();
		System.out.println(select);
		
		
	}
	
	public static void printAddMenu() {
		clearScreen();
		System.out.println("---ADD NEW PLAYER---");
		System.out.println("Enter player Name");
		System.out.println("");
		System.out.println("");
	}
	public static void printEditMenu() {
		clearScreen();
		System.out.println("---EDIT EXISTING PLAYER--");
		System.out.println("Enter player ID/n OR");
		System.out.println("Enter player Name");
		
	}
	public static void prinClass() {
		
		
	}
	
	
	
}
>>>>>>> 8f27427cacec42528a4ede4347c7b2b72a6df811
