import java.util.Scanner
/**
 * This class specifies the behaviours and attributes of a player.
 * 
 * @author (Han Jacobs) 
 * @version (Semester 1 2018)
 */

;
public class Player
{
    // the Player class fields.
    public String name;
    public int scorePlayer;
   
    public int playerWins;
   

    /**
     * Default Constructor for objects of class Player.
     */
    public Player()
    {
        // initialise instance variables
        name = "Player 1";
        scorePlayer = 0;
       

    }
    
    /**
     * Constructor which allows user to choose their name.
     */
    public Player(String playerName)
    {
        // initialise instance variables
        if (playerName.length() <= 8)
        {
            name = playerName;
        }
        else
        {
            name = "Player 1";    
        }
        scorePlayer = 0;
        

    }

    public void assignName(String assignName)
    {
        name = assignName;
    }
    
    public int getPlayerWins()
    {
        return playerWins;
    }
    
     public void printPlayerName()
    {
        System.out.println(name);
    }
    
    public String getName()
    {
        return name;
       
    }

    public int getScorePlayer()
    {

        return scorePlayer;
    }
    
     public void incrementPlayerWins()
    {
        playerWins +=1;
    }
    
       public void resetScorePlayer()
    {

        scorePlayer = 0 ;
    }
 
    public void setScorePlayer(int playerGameScore)
    {

        scorePlayer += playerGameScore ;
    
        
     

}
}
