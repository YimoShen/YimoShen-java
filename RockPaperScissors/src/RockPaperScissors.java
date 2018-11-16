import java.util.Scanner;

public class RockPaperScissors {
    public static String user = " ";
    public static String console = " ";
    public static int userScore = 0;
    public static int consoleScore = 0;

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("What is your name?");
        String username = console.next();
        System.out.print("How many games do you want to play? Choose either 3 or 5.");
        String choice = console.next();
    }
}
        /* while (checkWinner()==){
            if (userScore>3||consoleScore>3){
                System.out.println("Game Over!");
                if (userScore>consoleScore){
                    System.out.println("User Wins!");
                }
                else {
                    System.out.println("Console Wins!");
                }
                printScore();
            }
            else {
                user = " ";
                con = " ";
                userScore = 0;
                checkWinner();
                System.out.println("User, take your pick! R/S");
            }
        }
    }
    public static void checkWinner(){
    if (user==console){
        System.out.println("Tie! No points given.");

    if ((user==r&&con==s))||(user==s&&con==p)||(user==p&&con==r)){
        System.out.println("User wins! 1 point given to the user");
        userScore += 1;
     }
     if ((user==s&&con==r))||(user==p&&con==s)||(user==r&&con==s)){
        System.out.println("Computer wins! 1 point given to the computer");
        consoleScore += 1;
     } */