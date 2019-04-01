package rugbyTeam;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Player player1 = new Player(1, "Team1", "stadium1", "RUF1235", "John Do", 1);
		Player player2 = new Player(2,"Team1", "stadium1", "RUF12346", "Jane Doe", 10);
		player2.setCareerTries(1);
		player1.setCareerTries(10);
		player1.setPlayerID("RUF12345");
		System.out.println(player1.getplayerID());
		UX.printEditMenu();
		UX.printAddMenu();
		UX.printEditMenu();
		UX.printfirstMenu();
		
	}
//this is an edit
	
}

