
/**
 * This Class.
 * 
 * @author (Hannock Jacoms) 
 * @version (Semester 1 2018)
 * This class is like the start button it just starts the game and that's it, it just provides for a cleaner interface.
 */
public class GamePlay
{

    private GameCode Gue55ingGame;

    /**
     * Constructor for objects of class GamePlay
     */
    public GamePlay()
    {
        // initialise instance variables
        Gue55ingGame = new GameCode();
    }
    
      public void getcompscore()
    {
    System.out.println(Gue55ingGame.getCompScore());
    }
    
     /**
     * These are accessor methods for the GamePlay Class.
     */
    public void getplayerdetails()
    {
    Gue55ingGame.getPlayerName();
    }
   
     public void getPlayerscore()
    {
    System.out.println(Gue55ingGame.getPlayerScore());
    }
    
      /**
     * This Starts the Game!
     */
    public void startGame()
    {
    Gue55ingGame.playGame();
    }
}


