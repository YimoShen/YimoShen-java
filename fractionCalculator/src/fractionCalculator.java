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
        Scanner console = new Scanner(System.in);
        System.out.println("Enter Start to begin program.");
        String input = "Start";
        String token;

        while(input.equals("Start")){
            System.out.println("Enter 3 words");
            token = console.next();
            System.out.println(token);


           /*
            int j = -1;
            int n = 0;
            String [] fraction = new String [3];
            for(int i = 0; i < looper.length(); i++){
                j++;
                if (looper.charAt(i)==' ') {
                    System.out.println(looper.substring(n,i));
                    j = 1;
                    n++;
                }
                if (n == 2){
                    System.out.println(looper.substring(i+1));
                    fraction[n] = looper.substring(i);
                    n++;
                }
            }
            if (looper.equals("Exit")) {
                break;
            }
            */

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