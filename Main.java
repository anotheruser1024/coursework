package rugbyTeam;

public class Main {

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		Player player1 = new Player(1, "Team1", "stadium1", "RUF1234b", "John Do", 1);
		
		player1.setPlayerID("RUF1234b");
		System.out.println(player1.getplayerID());
		UX.printEditMenu();
		UX.printAddMenu();
		UX.printEditMenu();
		UX.printfirstMenu();
		
	}

	
}
