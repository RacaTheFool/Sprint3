import java.util.Random;
import java.util.Scanner;

/***************************************************** 
 * NUMBER GUESSING GAME
 *****************************************************
 * Game where the user is prompted to guess a number
 * between 1 and 100. The game randomly generates
 * a number when run and ends when it is guessed
 * correctly. Tells the user if the number they
 * are trying to guess is higher or lower than their
 * guess.
 *****************************************************/
public class NumGuessGame {
    
    int numGuess;       // The guessed number
    int guessCount;     // Counts the number of guesses
    Boolean isCorrect;  // True if the guess is wrong
    int numRand;        // The Randomly generated number
    
    // Set the starting values
    public NumGuessGame()
    {
        numGuess = 0;
        guessCount = 0;
        isCorrect = false;
        Random rand = new Random(); // Used to generate the random number
        numRand = rand.nextInt(100);
    }
    
    // Displays the Rules of the game
    private void displayRules() {
        System.out.println("How to play: The game will randomly generate");
        System.out.println("a number between 1 and 100. You're goal is");
        System.out.println("to try and guess what that number is in");
        System.out.println("as few turns as possible. If the generated");
        System.out.println("number is lower than your guess than the");
        System.out.println("game will tell you \"Lower\", meaning that");
        System.out.println("you should guess lower, and if higher it");
        System.out.println("will say \"Higher\".");
    }
    
    // check the users guess
    private void checkGuess()
    {
        // If the user guesses lower than the number
        // tell them to guess higher, and vise versa.
        // If they guess correctly change isCorrect to
        // 'true' nad congratulate them. Increment the guess count.
        if (numGuess < numRand)
        {
            System.out.println("Higher");
        }
        else if ( numGuess > numRand)
        {
            System.out.println("Lower");
        }
        else if (numGuess == numRand)
        {
            System.out.println("Congratulations! The correct number is " + numRand + ".");
            isCorrect = true;
        }
        guessCount++;
    }
    
    // Play the game
    public void play() 
    {
        // Display the introduction to the user
        System.out.println("Welcome to the Number Guessing Game!\n");
        System.out.println("Enter 0 for an explanation of the rules,");
        System.out.println("otherwise begin guessing numbers between 1 and 100.");
        
        Scanner choice = new Scanner(System.in);    // Used to receive user input
       
        // Prompt the user for a guess or to display the rules and run the
        // appropriate method. If an invalid number is used inform the
        // user of the problem and reprompt.
        do {
            System.out.print("> ");
            numGuess = choice.nextInt();
            System.out.println();
            if (numGuess == 0)
            {
                displayRules();
            }
            else if (1 <= numGuess && numGuess <= 100)
            {
                checkGuess();
            }
            else
            {
                System.out.println("Incorrect value.");
                System.out.println("Please enter a number between 1 and 100");
                System.out.println("or enter 0 for the rules.");
            }


        }
        while (!isCorrect);   // Repeat while the user is NOT correct

        // Display to the user how many guesses it took them
        System.out.println("This round took you " + guessCount + " turns.");
    }
}