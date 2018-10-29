import java.util.Scanner;
/**
 * Write a description of class week5 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class week5
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class week5
     */
    public week5()
    {
        // initialise instance variables
        x = 0;
    }

    
     public void isStringValid()
    {
        //This method works in conjunction with the isStringNumericPlayer method to make sure the numberguess entry is valid.
       System.out.println("please enter the string");
       Scanner check = new Scanner(System.in);
       String c = check.nextLine();
       if (c.length() != 4)
       {
        System.out.println("invalid length");   
        }
        else
        {
         isStringNumericPlayer(c) ;  
        }
    }    
    
    public boolean isCharNumeric(char c)
    {
        //This method works in conjunction with the isStringNumericPlayer method to make sure the numberguess entry is valid.
        char a = c;
        boolean isCharNumeric = Character.isDigit(a);
return isCharNumeric;
    }

    public void isStringNumericPlayer(String z)
    {
        // This tests to make sure the numberguess entry is valid
        boolean   isStringNumeric = true;
        for( int position = 0; position < z.length(); position ++)
        {
            isStringNumeric = isCharNumeric(z.charAt(position));
           

        }

 if (!isStringNumeric)
            {
                System.out.println("You have entered non-numeric characters, please only use numbers");
            }
            else
            {
            switch(z.charAt(0))
            {
               case '2':   System.out.println("nsw");; 
            break;
            case '3':   System.out.println("vic"); 
            break;
            case '4':  System.out.println("nsw"); 
            }
                
            }
    }
}
