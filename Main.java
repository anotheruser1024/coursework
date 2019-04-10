package rugbyTeam;

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
    } //taken from Geeks for Geeks  helper function 
	
	

	public static void main(String args[]) {
		// TODO Auto-generated method stub
		
		Players.addNewPlayer("wolfs", "Leeds", "12344", "RUF12345", "jim jones", 1);
		UX.CreatPlayerNew();
		
		//UX.PlayerNew();
		
		
		
	}
//this is an edit
	
}

