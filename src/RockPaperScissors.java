import java.util.Scanner;

public class RockPaperScissors
{
    static void main()
    {
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String playAgain = "";
        boolean done = false;

        do
        {
            // Player A
            done = false;

            do
            {
                IO.print("Player A enter your move [R/P/S]: ");
                playerA = in.nextLine();

                if(playerA.equalsIgnoreCase("R") ||
                        playerA.equalsIgnoreCase("P") ||
                        playerA.equalsIgnoreCase("S"))
                {
                    done = true;
                }
                else
                {
                    IO.println("Invalid move!");
                    IO.println("You must enter R, P, or S.");
                }

            }while(!done);


            // Player B
            done = false;

            do
            {
                IO.print("Player B enter your move [R/P/S]: ");
                playerB = in.nextLine();

                if(playerB.equalsIgnoreCase("R") ||
                        playerB.equalsIgnoreCase("P") ||
                        playerB.equalsIgnoreCase("S"))
                {
                    done = true;
                }
                else
                {
                    IO.println("Invalid move!");
                    IO.println("You must enter R, P, or S.");
                }

            }while(!done);


            // Determine winner
            if(playerA.equalsIgnoreCase(playerB))
            {
                if(playerA.equalsIgnoreCase("R"))
                {
                    IO.println("Rock vs Rock - It's a Tie!");
                }
                else if(playerA.equalsIgnoreCase("P"))
                {
                    IO.println("Paper vs Paper - It's a Tie!");
                }
                else
                {
                    IO.println("Scissors vs Scissors - It's a Tie!");
                }
            }

            else if(playerA.equalsIgnoreCase("R") &&
                    playerB.equalsIgnoreCase("S"))
            {
                IO.println("Rock breaks Scissors!");
                IO.println("Player A wins!");
            }

            else if(playerA.equalsIgnoreCase("P") &&
                    playerB.equalsIgnoreCase("R"))
            {
                IO.println("Paper covers Rock!");
                IO.println("Player A wins!");
            }

            else if(playerA.equalsIgnoreCase("S") &&
                    playerB.equalsIgnoreCase("P"))
            {
                IO.println("Scissors cuts Paper!");
                IO.println("Player A wins!");
            }

            else
            {
                if(playerB.equalsIgnoreCase("R"))
                {
                    IO.println("Rock breaks Scissors!");
                }
                else if(playerB.equalsIgnoreCase("P"))
                {
                    IO.println("Paper covers Rock!");
                }
                else
                {
                    IO.println("Scissors cuts Paper!");
                }

                IO.println("Player B wins!");
            }


            // Play again
            do
            {
                IO.print("Would you like to play again? [Y/N]: ");
                playAgain = in.nextLine();

                if(!playAgain.equalsIgnoreCase("Y") &&
                        !playAgain.equalsIgnoreCase("N"))
                {
                    IO.println("You must enter Y or N.");
                }

            }while(!playAgain.equalsIgnoreCase("Y") &&
                    !playAgain.equalsIgnoreCase("N"));

            IO.println();

        }while(playAgain.equalsIgnoreCase("Y"));

        IO.println("Thanks for playing!");
    }
}