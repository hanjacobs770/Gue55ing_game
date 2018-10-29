import java.util.Scanner;
/**
 * The Game class manages the playing of the game.
 * 
 * @author (Han Jacobs) בס"ד
 * @version (Semester 1 2018)
 */

/**
 *Please refer to the following contents list arranged in alphabetical order
 *Fields declaration
 *Constructor  GameCode()
 *Method 1 endGame()
 *Method 2 endRound()
 *Method 3 getAttempts()
 *Method 4 getCompScore()
 *Method 5 getComputerName()
 *Method 6 getPlayerName()
 *Method 7 getPlayerScore()
 *Method 8 isCharNumeric(char c)
 *Method 9 isStringNumericPlayer(String z)
 *Method 10 newGame()
 *Method 11 newRound()
 *Method 12 playAgain()
 *Method 13 playGame()
 *Method 14 playerPlay()
 *Method 15 playComputer()
 *Method 16 scoreAllocateCompWins()
 *Method 17 scoreAllocatePlayer1Wins()
 *Method 18 setName()
 *Method 19 enterCorrectName()
 */


public class GameCode
{   // This is the Human Player
    private Player Player1;
    // This is the computer player
    private Player Computer;
    // This decides who plays first
    private RandomNumber Randomset;
    // This is the secret number
    public int randomNumber1;
    // This is used when allocating the score
    private int attempts;
    // This is used to set the guessing range
    private int rangeMax;
    private int rangeMin;
    //This is used to decide when to end the game
    private int rounds;
    //The follwong ints are used in scoring
    private int playerWins;
    private int computerWins;
    private int scoreStorePlayer1;
    private int scoreStoreComputer;
    //This is used to decide when to end the game
    private int turns;

    public GameCode()
    {
        Player1 = new Player();
        //give the computer a default name
        Computer = new Player("computer");
        Randomset = new RandomNumber();   
        randomNumber1 = Randomset.getRandomNumber();
        attempts = 0;
        rangeMax = 100;
        rangeMin = 1;
        //Playing the first round
        rounds = 1;
        playerWins = 0;
        computerWins = 0;
        scoreStorePlayer1 = 0;
        scoreStoreComputer = 0;
        turns = 0; 
    }
    // All methods have been arranged in alphabetical order
    
    public void endGame()

    /**
     * This method ends the game
     */
    {
        // If the current round is the final round 4
        int  roundLimit = 4;
        if(rounds == roundLimit)
        {
            if(Player1.getScorePlayer() > Computer.getScorePlayer())
            {
                System.out.println("Well thanks for playing the game is over");
                System.out.println("You scored " + Player1.getScorePlayer() + " And the computer scored " + Computer.getScorePlayer());
                System.out.println("So the winner is: " + Player1.getName() );
                playAgain();
            }
            else
            if (Player1.getScorePlayer() < Computer.getScorePlayer())

            {
                System.out.println("Well thanks for playing the game is over");
                System.out.println("You scored " + Player1.getScorePlayer() + " And the computer scored " + Computer.getScorePlayer());
                System.out.println("So the winner is: the " + Computer.getName());
                playAgain();
            }
            else
            if
            (Player1.getScorePlayer() == Computer.getScorePlayer())
            {
                System.out.println("Well thanks for playing the game is over");
                System.out.println("You scored " + Player1.getScorePlayer() + " And the computer scored " + Computer.getScorePlayer());
                System.out.println("The game was tied!" );
                playAgain();
            }
        }
    }

    public void endRound()
    /**
     * This method ends the round
     */
    {
        scoreStorePlayer1 = 0;
        scoreStoreComputer = 0;
        int roundLimit = 4;
        // if the current round is less than 4
        if(rounds < roundLimit)
        {
            newRound();
        } 
        // if the current round = 4.
        else if(rounds == roundLimit)
        {
            endGame();
        }
    }

    public int getAttempts()
    {
        return attempts;
    }

    public int getCompScore()
    {
        //This returns the computers current score
        return Computer.getScorePlayer();
    }

    public void getComputerName()
    {
        //This returns the Computers' name
        Computer.getName();
    }

    public void getPlayerName()
    {
        //This returns the players' name
        Player1.getName();
    }

    public int getPlayerScore()
    {
        //This returns the players current score
        return Player1.getScorePlayer();

    }

    public boolean isCharNumeric(char c)
    {
        //This method works in conjunction with the isStringNumericPlayer method to make sure the numberguess entry is valid.
        char a = c;
        boolean isCharNumeric = Character.isDigit(a);
        return isCharNumeric;

    }

    public boolean isStringNumericPlayer(String z)
    {
        // This tests to make sure the numberguess entry is valid
        boolean   isStringNumeric = true;
        for( int position = 0; position < z.length(); position ++)
        {
            isStringNumeric = isCharNumeric(z.charAt(position));
            if (!isStringNumeric)
            {
                System.out.println("You have entered non-numeric characters, please only use numbers");
                playerPlay();

            }

        }

        return isStringNumeric;

    }

    public void newGame()
    {
        //This starts a newgame
        rounds = 0;
        randomNumber1 = Randomset.getRandomNumber();      
        attempts = 0;
        rangeMax = 100;
        rangeMin = 1;
        rounds = 1;
        playerWins = 0;
        computerWins = 0;
        Player1.resetScorePlayer();
        Computer.resetScorePlayer();
        playGame();
    }

    public void newRound()
    {
        //This starts a newround
        int roundLimit = 4;
        int guessesPerRound = 6;
        if(rounds < roundLimit)
        {
            System.out.println("The round is complete please press enter to continue");
            Scanner console = new Scanner(System.in);
            console.nextLine();
            System.out.print('\u000C');            
            System.out.println("Round " + rounds + " is over!" );
            attempts = 0;
            rounds += 1;
            System.out.println("Your score is " + Player1.getScorePlayer() + " The computer's score is " + Computer.getScorePlayer());
            System.out.println("Now let's play round " + rounds);
            randomNumber1 = Randomset.getRandomNumber();
            playerWins = 0;
            computerWins = 0;
            rangeMax = 100;
            rangeMin = 1;
            turns = 0;
            playGame();
        }

    }

    public void playAgain()
    {
        //This method allows the player to choose to play again once the game has ended
        System.out.println("Thanks again for playing" );  
        System.out.println("If you would like to play again please enter y for yes or n for no" );  
        Scanner console = new Scanner(System.in);
        char choice = console.nextLine().charAt(0); 
        if (choice == 'y')
        {
            newGame();
        }
        else
        {
            System.out.println("the program will now end" );
            System.exit(0);
        }
    }

    public  void  playGame()
    {
        //This mehtod starts the game
        int randomStart1 = Randomset.getRandomStart();  
        int abandomGameIndicator1 = Randomset.getAbandomGameIndicator();
        int abandonGameCheck1 = Randomset.getAbandonGameCheck();    
        if (turns <= 1 && rounds == 1)
        {
            setName();
        }

        if(abandonGameCheck1 == abandomGameIndicator1) 
        {
            System.out.println("The computer has abandoned the game");
            //break;
            endRound();
            // break;
        }

        if(randomStart1 == 1)
        {
            playerPlay();
        }
        else if (randomStart1 == 2)
        {
            playComputer();  
        }

    }

    public void  playerPlay()
    /**
     * This method manages the players turn
     */
    {
        // These variables define intergers which will be used for calculations
        int guessesPerRound = 6;
        int proximityPlayer = 0;
        Scanner console = new Scanner(System.in);
        System.out.println("Ok great, your turn. Please have a guess for the random number between the range of " + rangeMin + " " + rangeMax);
        String numberGuess = console.nextLine();
        isStringNumericPlayer(numberGuess);

        if((Integer.parseInt(numberGuess) > 100 && Integer.parseInt(numberGuess)!= 999) || Integer.parseInt(numberGuess) < 1)
        {
            System.out.println("The number you entered is outside of the possible range please try again");
            attempts += 1;
            playerPlay();

        }

        if ( Integer.parseInt(numberGuess) == 999)
        {
            System.out.println("You have abandoned the round, bad luck");
            System.out.println();
            endRound();
        }

        if (Integer.parseInt(numberGuess)!= randomNumber1)
        {

            if((Integer.parseInt(numberGuess) <= 100 && Integer.parseInt(numberGuess) > rangeMax) || (Integer.parseInt(numberGuess) < rangeMin && Integer.parseInt(numberGuess) >= 1))
            {
                System.out.println("That number is invalid, valid numbers are only within the range of " + rangeMin + " to " + rangeMax + " your turn is over"); 
                attempts += 1;
                turns += 1;
                if(((turns) % guessesPerRound) == 0)
                {
                    Player1.setScorePlayer(scoreStorePlayer1);
                    Computer.setScorePlayer(scoreStoreComputer);
                    turns = 0;
                    endRound();
                }
                playComputer();
            }
            else if(Integer.parseInt(numberGuess) > randomNumber1) 
            {
                // In the case where the playr guesses a number higher than the secret number.
                rangeMax = Integer.parseInt(numberGuess);
                System.out.println("The number you entered was higher than the secret number, therefore the new range is now from: " + rangeMin + " to " + rangeMax);  
                System.out.println("Now it's the Computer's turn");
                attempts += 1;
                turns += 1;
                proximityPlayer = Integer.parseInt(numberGuess) - randomNumber1;
            }
            else if(Integer.parseInt(numberGuess) < randomNumber1) 
            { 
                // In the case where the playr guesses a number lower than the secret number.
                rangeMin = Integer.parseInt(numberGuess);
                System.out.println("The number you entered was lower than the secret number, therefore the new range is now from: " + rangeMin + " to " + rangeMax);  
                System.out.println("Now it's the Computer's turn");
                attempts += 1;
                turns += 1;
                proximityPlayer = randomNumber1 -Integer.parseInt(numberGuess);
            }
        }

        else if (Integer.parseInt(numberGuess) == randomNumber1) 
        {
            System.out.println("Well done you have won the round by guessing the number correctly");
            attempts += 1;
            Player1.incrementPlayerWins();
            playerWins +=1;
            scoreAllocatePlayer1Wins();            

        }

        if (  proximityPlayer > 0 && proximityPlayer < 10 )
        {
            if (((10 - proximityPlayer) - scoreStorePlayer1) > 0)
            {
                scoreStorePlayer1 += ((10 - proximityPlayer) - scoreStorePlayer1);
            }
        }

        if(((turns) % guessesPerRound) == 0)
        {
            Player1.setScorePlayer(scoreStorePlayer1);
            Computer.setScorePlayer(scoreStoreComputer);
            turns = 0;
            endRound();
        }

        if (((turns) % guessesPerRound) != 0)
        {
            playComputer();
        }

    }

    public void playComputer() 
     /**
     * This method characterises the computers turn
     */
    
    {

        int guessesPerRound = 6;
        int  proximityComp = 0;
        if(turns == 0)
        {
            System.out.println("Ok, the Computer will have the first turn");
        }

        int numberGuessComp = (int)(Math.random()*((rangeMax-rangeMin)+1))+rangeMin;;

        if (numberGuessComp!= randomNumber1)
        {

            if(numberGuessComp > randomNumber1 ) 
            {

                // When the computer guesses higher than the secret number.
                rangeMax = numberGuessComp;
                System.out.println("The Computer's number was " + numberGuessComp + " this number is higher than the secret number");
                System.out.println("Therefore the new range is now from: " + rangeMin + " to " + rangeMax);

                attempts += 1;
                turns += 1;
                proximityComp =  numberGuessComp - randomNumber1;
            }
            else 
            {
                // When the computer guesses lower than the secret number.
                rangeMin = numberGuessComp;
                System.out.println("The Computer's number was " + numberGuessComp + " this number is lower than the secret number");
                attempts += 1;
                turns += 1;
                proximityComp =  randomNumber1 - numberGuessComp;
            }
        }
        else if (numberGuessComp == randomNumber1) 
        {
            System.out.println("The Computer has won the round by guessing the number correctly");
            attempts += 1;
            Computer.incrementPlayerWins();
            computerWins +=1;
            scoreAllocateCompWins();

        }

        if (  proximityComp > 0 && proximityComp < 10 )
        {
            if (((10 - proximityComp) - scoreStoreComputer) > 0)
            {
                scoreStoreComputer += ((10 - proximityComp) - scoreStoreComputer);
            }
        }

        if(((turns) % guessesPerRound) == 0)
        {
            Player1.setScorePlayer(scoreStorePlayer1);
            Computer.setScorePlayer(scoreStoreComputer);
            turns = 0;

            endRound();
        }

        if (((turns) % guessesPerRound) != 0)
        {
            playerPlay();
        }
    }

    public void scoreAllocateCompWins()
    //This method allocates the score if the computer wins
    {        
        switch (attempts)
        {
            case 1:  Computer.setScorePlayer(20); 
            break;
            case 2:  Computer.setScorePlayer(15); 
            break;
            case 3:  Computer.setScorePlayer(11); 
            break;
            case 4:  Computer.setScorePlayer(8); 
            break;
            case 5:  Computer.setScorePlayer(6); 
            break;
            case 6:  Computer.setScorePlayer(5); 
            break;
        }
        endRound();
        //Player1.setscorecomp(scorecomp1);
    }

    public void scoreAllocatePlayer1Wins()
    //This method allocates the score if the player wins
    {
        switch (attempts)
        {
            case 1: Player1.setScorePlayer(20); 
            break;
            case 2:  Player1.setScorePlayer(15); 
            break;
            case 3:  Player1.setScorePlayer(11); 
            break;
            case 4:  Player1.setScorePlayer(8); 
            break;
            case 5:  Player1.setScorePlayer(6); 
            break;
            case 6:  Player1.setScorePlayer(5); 
            break;
        }
        endRound();
        //Player1.setscoreplayer(scorecomp1);
    }

    public void setName()
     /**
     * This method makes sure that the name entry is valid
     */
    {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to the Gue55ing game, please enter your name!");
        String name = console.nextLine().trim();

        if(name.length() <= 8)
        {
            System.out.println("Hello, " + name);
            Player1.assignName(name);
        }
        else
        {
            enterCorrectName();
        }       
    }

    public void  enterCorrectName()
    {
        //This method works in conjunction with the setname method to make sure the name entry is valid.
        System.out.println("Please enter name with a maximum of 8 characters");   
        setName();
    } 
}

