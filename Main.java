package rugbyTeam;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class Main {
	static String capitailizeWord(String str) { 
        StringBuffer cs = new StringBuffer(); 
  
        // Declare a character of space 
        // To identify that the next character is the starting 
        // of a new word 
        char ch = ' '; 
        for (int i = 0; i < str.length(); i++) { 
              
            //if is space and string not space 
        	// character is at start of word 
            if (ch == ' ' && str.charAt(i) != ' ') 
                cs.append(Character.toUpperCase(str.charAt(i))); 
            else
                cs.append(str.charAt(i)); 
            ch = str.charAt(i); 
        }   //convert string buffer to string 
        String stringout =cs.toString().trim();
        return stringout; 
    }  
	
	

	public static void main(String args[])  {
		// 
		
		
		try {
			Players.loadFile("players.txt");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		UX.selectOptionHome();

		try {
			Players.save("players.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int count = 4;
		while(count != 0) {
		System.out.println("closing in: " + count);
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		count -=1;
		}
	    System.out.println("Bye");
	    System.exit(0);
	}
//this is an edit
	
}

