
/**
 * This class defines all random number sets used in the game.
 * 
 * @author (Han Jacobs) 
 * @version (Semester 1 2018)
 */
public class RandomNumber
{
    // instance variables - replace the example below with your own
    public int randomNumber;
    public int randomStart;
    public int abandomGameIndicator;
    public int abandonGameCheck;

    /**
     * Constructor for objects of class RandomNumber
     * I found the Math.Random method through Google.
     */
    public RandomNumber()
    {

        randomNumber = (int)(Math.random()*((100-1)+1))+1;;
        randomStart = 1; //(int)(Math.random()*((2-1)+1))+1;;
        abandomGameIndicator = (int)(Math.random()*((20-1)+1))+1;;
        abandonGameCheck = (int)(Math.random()*((20-1)+1))+1;;

    }

    /**
     * The following methods can be called in the subsequent game rounds when new sets of random numbers need to be crated.
     */

    public void abandonGameCheck()
    {
        // this variable checks whether or not the computer abandons the round against the abandomGame Indicator
        abandonGameCheck = (int)(Math.random()*((20-1)+1))+1;;

    }

    public void abandomGameIndicator()
    {
        // this variable determines whether or not the computer abandons the round
        abandomGameIndicator = (int)(Math.random()*((20-1)+1))+1;;

    }

    public int getAbandonGameCheck()
    {
        abandonGameCheck = (int)(Math.random()*((20-1)+1))+1;;
        return abandonGameCheck;

    }

    public int getAbandomGameIndicator()
    {
        abandomGameIndicator = (int)(Math.random()*((20-1)+1))+1;;
        return abandomGameIndicator;

    }

    public int getRandomNumber()
    {
        randomNumber = (int)(Math.random()*((100-1)+1))+1;;
        return randomNumber;

    }

    public int getRandomStart()
    {    
        randomStart = (int)(Math.random()*((2-1)+1))+1;;   
        return randomStart;

    } 

    public void newAbandonGameCheck()       
    {
        // this variable determines whether or not the computer abandons the round
        abandonGameCheck = (int)(Math.random()*((20-1)+1))+1;;

    }

    public void newAbandomGameIndicator()       
    {
        // variable determines whether or not the computer abandons the round
        abandomGameIndicator = (int)(Math.random()*((20-1)+1))+1;;

    }

    public void newRandomStart()       
    {
        // This variable determines who starts the round
        randomStart = (int)(Math.random()*((2-1)+1))+1;;   

    }

    public void randomNumber()
    {
        // this variable represents the Random number
        randomNumber = (int)(Math.random()*((100-1)+1))+1;;

    }

    public void randomStart()
    {
        // this variable determines who starts the round
        randomStart = (int)(Math.random()*((2-1)+1))+1;;    

    }
}
