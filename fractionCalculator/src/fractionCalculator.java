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

        //Looper
        Scanner userInput = new Scanner(System.in);
        System.out.println("To begin, enter start.");
        String input = userInput.next();
        Scanner console = new Scanner(System.in);
        System.out.println("Enter 3 words or Quit");

        while (!input.equals("Quit")) {
            String token[] = new String[3];

            input = console.next();
            if (input.equals("Quit")) {
                break;
            }
            token[0] = input;

            input = console.next();
            if (input.equals("Quit")){
                break;
            }
            token[1] = input;

            input = console.next();
            if (input.equals("Quit")){
                break;
            }
            token[2] = input;

            System.out.println(token[0]);
            System.out.println(token[1]);
            System.out.println(token[2]);
        }
    }

    //Parser

    public static int parseWhole(final String fraction) {
        if (fraction.contains("_")) {
            return Integer.parseInt(fraction.substring(0, fraction.indexOf("_")));
        } else {
            return 0;
        }
    }

    public static int parseNume(final String fraction) {
        if (fraction.contains("_")) {
            String a = fraction.substring(fraction.indexOf("_")+1);
           return Integer.parseInt(fraction.substring(0, fraction.indexOf("/")));
        } else if (fraction.contains("/")) {
            String b = fraction.substring(0, fraction.indexOf("/"));
            return Integer.parseInt(b);
        }
        else {
            return 0;
        }
    }

    public static int parseDenom(final String fraction) {
        if (fraction.contains("/")) {
            String Demom = fraction.substring(fraction.indexOf("/")) + 1;
            return Integer.parseInt(fraction);
        } else {
            return 1;
        }
    }

    //littleCalc
    int denominator1;
    int denominator2;
}
