/* Rachel Shaw - 2.2 Assignment - 1/16/2025 */
/* The purpose of this program is to simulate the game "Rock Paper scissors by using random number generation" */

import java.util.Scanner;
public class shawM2_2 {
    public static void main(String[] args) {
        
        char contLoop = 'y';

        while (contLoop == 'y' ) {

            /*Generates random number up to 3 */
            int randomNumber = (int)(Math.random() * 4);
            int cantBeZero = 0;
        
            /* ensures random number isn't zero */
            while (randomNumber == cantBeZero){
                randomNumber = (int)(Math.random()) * 4;
            }

            Scanner input = new Scanner(System.in);
            System.out.println("Enter a number 1 -> 3");
            int userInput = input.nextInt();

        
            System.out.println("You: " + converter(userInput));
            System.out.println("Computer: " + converter(randomNumber));
            System.out.println(winner(randomNumber, userInput));

            /* ask user if they would like to continue */
            System.out.println("enter 'y' to play again. Enter any other key to exit");
            contLoop = input.next().charAt(0);
        }
    }

    /* Method for determining the Winner */
    public static String winner(int computer, int player){
        /* All results in which computer wins */
        if (((computer == 2) && (player == 1)) || ((computer == 1) && (player == 3)) || ((computer == 3) && (player == 2))){
            return "Computer wins!";
        }
        /* all results in which player wins */
        if (((player == 2) && (computer == 1)) || ((player == 1) && (computer == 3)) || ((player == 3) && (computer == 2))){
                return "You win!";
        }

        /* in the event that player and computer both pick the same number */
        else{
            return "It's a tie!";
        }
    }

    /* Converts Number input to rock, paper, or scissors */
    public static String converter(int num){
        int paper = 2;
        int  scissors = 3;

        
        if(num == paper){
            String result = "2 (paper)";
            return result;
        }

        if (num == scissors){
            String result = "3 (scissors)";
            return result;
        }

        else{
            String result = "1 (rock)";
            return result;
        }
    }
}
