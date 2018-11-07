import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
       Scanner userinput = new Scanner (System.in);
       String user = "";
       String console = "";
       int userScore = 0;
       int consoleScore = 0;
       while(playGame()=="y"){
           if (userScore > 1 || consoleScore >1){
               System.out.println("The game is over!");
               if (userScore > consoleScore){
                   System.out.println("User wins!");
               } else {
                   System.out.println("Console wins!");
               }
               printScore();
           } else {

           }
       }
    }
}
