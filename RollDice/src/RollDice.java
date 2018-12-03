import java.util.*;
public class RollDice {
    public static final int DICENUM = 1;
    String dice [][] = new String[6][5];
    String gameDice [][] = new String[DICENUM][5];

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Do you want to roll a dice?");
        String yourPick = console.next();

        while (yourPick.equals("Yes")) {
            defineDice();
            printDice();
            rollDice();
            drawLine();
            System.out.println("Do you want to play again? Enter Yes or No.");
            yourPick = console.next();
        }

    }

    public static void defineDice() {
        String TopBottom [] = {"-------"};
        System.out.println("|     |");
        System.out.println("|  *  |");
        System.out.println("|     |");
    }

    public static void printDice() {
        System.out.println("print dice");
    }

    public static void rollDice() {
        System.out.println("roll dice");
    }

    public static void drawLine() {
        System.out.println("draw line");
    }
}