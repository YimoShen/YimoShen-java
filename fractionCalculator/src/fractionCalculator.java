/*
***************************
Yimo Shen
Mrs. Transue
AP Computer Science A
Fraction Calculator Project
***************************
*/


import java.util.*;
public class fractionCalculator {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("To begin, enter start.");
        String input = userInput.next();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 3 words or Quit");

        while (!input.equals("Quit")) {
            input = console.next();
            System.out.println(input);
            String token [] = new String [3];
            token [0] = input;
            token [1] = input;
            token [2] = input;
        }
    }
    public static String add(final int firstNume, final int firstDenom,
                             final int secondNume, final int secondDenom) {
        return "";
    }

    public static String subtract(final int firstNume, final int firstDenom,
                                  final int secondNume, final int secondDenom) {
        return "";
    }

    public static String multiply(final int firstNume, final int firstDenom,
                                  final int secondNume, final int secondDenom) {
        return "";
    }

    public static String divide(final int firstNume, final int firstDenom,
                                final int secondNume, final int secondDenom) {
        return "";
    }

    public static int parseWhole(final String fraction) {
        return 0;
    }

    public static int parseNume(final String fraction) {
        return 0;
    }

    public static int parseDenom(final String fraction) {
        return 0;
    }
}
