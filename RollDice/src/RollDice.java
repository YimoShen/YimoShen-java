import java.util.Scanner;
import java.util.Random;

public class RollDice {
    public static final int DICENUM = 1;
    public static void main(String[] args) {
        System.out.println("Do you want to roll a dice?");
        Scanner rollTheDice = new Scanner(System.in);
        String yourPick = rollTheDice.next();
        yourPick = yourPick.toLowerCase();
        String dice[][] = defineDice();
        printAllDice(dice);

        while (yourPick.equals("Yes")) {
            rollDice();
            System.out.println(rollDice());
            printDice();
            drawLine();
            System.out.println("Do you want to roll again? Enter Yes or No");
            yourPick = rollTheDice.next();
        }
    }

    public static String[][] defineDice() {
        System.out.println("define dice");
        String defineDice[][] = new String[5][6];
        String topBottom[] = {" ------- ", " ------- ", " ------- ", " ------- ", " ------- ", " ------- "};
        String topMiddle[] = {"|       |","| *     |", "| *     |","|  * *  |", "|  * *  |", "|  * *  |"};
        String middleMiddle[] = {"|   *   |", "|       |", "|   *   |", "|       |", "|   *   |", "|  * *  |"};
        String bottomMiddle[] = {"|       |", "|     * |", "|     * |", "|  * *  |", "|  * *  |", "|  * *  |"};
        defineDice[0] = topBottom;
        defineDice[1] = topMiddle;
        defineDice[2] = middleMiddle;
        defineDice[3] = bottomMiddle;
        defineDice[4] = topBottom;
        return(defineDice);
    }

    public static void printDice() {
        System.out.println("printDice");
    }

    public static void printAllDice(String[][] dicePrinter) {
        for (int diceNum = 0; diceNum < 6; diceNum++) {
            for (int row = 0; row < 5; row++) {
                System.out.println(dicePrinter[row][diceNum]);
            }
            System.out.println();
        }
        System.out.println("printAllDice");
    }

    public static int rollDice() {
        Random roll = new Random();
        int outcome = roll.nextInt(6) + 1;
        System.out.println("rollDice");
        return(outcome);
    }
    public static void drawLine() {
        System.out.println("drawLine");
    }
}

