/*
*********************
Yimo Shen
AP Computer Science A
Mrs. Transue
November 17, 2018
Rock Paper Scissors
*********************
*/

import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static int userScore = 0; //initializes user score in this game.
    public static int consoleScore = 0; //initializes computer score in this game.
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name?");
        String username = console.next(); //Allows user to type hs/her name/

        String playAgain = "y"; //If the user wants to play again, entering "y' will resume the game.
        System.out.print("How many games do you want to play? Choose either 3 or 5.");
        int choice = console.nextInt(); //Allows the user to play either 3 games or 5 games.
        while (playAgain.equals("y")) { //This while loop generates the process of the whole game.
            while (userScore < choice && consoleScore < choice) { //while no one has won yet
                System.out.println("What is your pick? Rock, paper or scissors? Enter 0 for rock, 1 for paper and 2 for scissors.");
                System.out.println("Rock(0) beats scissors(2), paper(1) beats rock(0) and scissors(2) beats paper(1).");
                int yourPick = console.nextInt();
                System.out.println("You picked " + yourPick);
                Random computer = new Random(); //Computer generates its choice randomly (0,1 and 2).
                int computerPick = computer.nextInt(3);
                System.out.println("Computer picked " + computerPick);
                checkWinner(yourPick, computerPick); //Method that determines the winner of each round.
            }
            if (userScore > consoleScore) { //The user wins overall if he/she wins more rounds
                System.out.println("User Wins!");
            } else {
                System.out.println("Console Wins!"); ////The computer wins overall if it wins more rounds.
            }
            System.out.println("Game Over! Thanks for playing.");
            System.out.println(username+ ", do you want to play again? y/n");//Ask user if wanting to play again.
            playAgain = console.next();
        }
    }
    public static void checkWinner (int yourPick, int computerPick){ //Method that determines the winner of each round.
        if (yourPick==computerPick) { //Tie game scenario and no one gets points.
            System.out.println("Tie! No points given.");
        }
        if ((yourPick==0 && computerPick==2) || (yourPick==2 && computerPick==1) || (yourPick==1 && computerPick==0)){
            System.out.println("User wins! 1 point given to the user");
            userScore += 1; //The scenario when user wins one round and gets one point.
            System.out.println("The user has "+ userScore + " points.");
        }
        if ((yourPick==2 && computerPick==0) || (yourPick==1&&computerPick==2) || (yourPick==0&&computerPick==1)){
            System.out.println("Computer wins! 1 point given to the computer");
            consoleScore += 1; //The scenario when computer wins one round and gets one point.
            System.out.println("The computer has "+ consoleScore + " points.");
        }
    }
}
