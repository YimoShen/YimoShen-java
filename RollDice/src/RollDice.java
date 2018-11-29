import java.util.*;
public class RollDice {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("DO you want to roll a dice?");
        String userchoice = console.next();
        if (userchoice.equals("Yes")){
            System.out.println("Okay, let's roll a dice.");
        }

        while (true) {
            defineDice();
            printDice();
            rollDice();
            drawLine();
            break;

        }

    }

    public static void defineDice() {
        System.out.println("define dice");
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