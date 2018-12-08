/*
*********************
Yimo Shen
Mrs.Transue
AP Computer Science A
December 8, 2018
Roll Dice Project
*********************
*/

import java.util.Scanner;
import java.util.Random;

public class RollDice {
    public static final int DICENUM = 3;
    public static void main(String[] args) {
        System.out.println("Do you want to roll a dice?"); // interactive program that asks for user input
        Scanner rollTheDice = new Scanner(System.in);
        String yourPick = rollTheDice.next();
        yourPick = yourPick.toLowerCase();


        while (yourPick.equals("yes")) { // when user enters yes, the for loop below executes.
            for (int i = 0; i < DICENUM; i++){ //it will print the amount of dices the class constant DICENUM INDICATES.
                printDice();
            }
            drawLine(); //divider
            System.out.println("Do you want to roll again? Enter yes or no"); 
            yourPick = rollTheDice.next(); //interactive program that asks if user wants to roll again
        }
    }

    public static String[][] defineDice() { //prints out all the dices from 1 to 6
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

    public static void printDice() { //prints out one specific dice randomly by using roll dice method.
        String dice[][] = defineDice();
        int roll = rollDice();
        System.out.println(roll);
        for (int i = 0; i < 5; i++){
            System.out.println(dice[i][roll-1]);
        }
    }

    public static int rollDice() { //generates the number of the dice randomly
        Random roll = new Random();
        int outcome = roll.nextInt(6) + 1;
        return(outcome);
    }
    public static void drawLine() { //provides the divider between each roll.
        System.out.println("---------");
    }
}

