import java.util.Scanner;
import java.util.ArrayList;

/*************************************************
 * Main
 * ***********************************************
 * Used to run the game as well as display the
 * number of guesses for each round and the
 * avverage number of guesses.
*************************************************/
public class Main {
    public static void main(String[] args) 
    {
        // Create an ArrayList to hold the number of guesses for each round
        ArrayList<Integer> numGuessList = new ArrayList<Integer>();
        // Holds the option value selected, start at '1' to always start by playing the game
        int option = 1;
        // Scanner is used to receive user input
        Scanner choice = new Scanner(System.in);
        
        // Until option 4 is selected, prompt to play the game,
        // display the guess count for each round, or display
        // the guess average
        do {
            // Option 1: play game
            // Option 2: Show the number of guesses for each round
            // Option 3: Show the average number of guesses
            // Option 4: Quit
            if (option == 1)
            {
                NumGuessGame game = new NumGuessGame(); // Create a new game
                game.play();                            // Play the game
                numGuessList.add(game.guessCount);      // Add the guess count to the number of guesses list
                System.out.println();
            }
            else if (option == 2)
            {
                // Print the top row
                System.out.printf("%-22s%-22s\n","Round","Number of Guesses");

                // For each round print the round number and the number of guesses.
                // The number of each round will be offset by 1 as the index starts
                // at '0'
                for (int i = 0; i < numGuessList.size(); i++)
                {
                    System.out.printf("%-22d%-22d\n", i + 1, numGuessList.get(i));
                }
                System.out.println();
            }
            else if (option == 3)
            {
                int total = 0;          // Will hold the total, start at '0' for summing
                double average = 0.0;   // Will hold the average after calculation

                // Add each value for the number of guesses and then divide
                // the total by the number of rounds.
                int i= 0;   // 'i' needs to be kept in scope for the later division
                for (; i < numGuessList.size(); i++)
                {
                    total += numGuessList.get(i);
                }

                if (i != 0)
                {
                    average = (double) total / (double) i;    // Get the average
                }

                // Display the average to the user
                System.out.println("You have an average of " + average + " guesses per round.\n");
            }

            // Prompt the user to select an option
            System.out.println("What would you like to do?");
            System.out.println("1) Play Again");
            System.out.println("2) Show Guess Counts for Each Round");
            System.out.println("3) Show Average Guess Count");
            System.out.println("4) Quit");

            System.out.print("> ");
            
            option = choice.nextInt();
            System.out.println();
        }
        while (option != 4);
    }
}