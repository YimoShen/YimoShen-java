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
        String looper = console.next();

        while(looper.equals("Start")){
            System.out.println("Enter something");
            looper = console.nextLine();
            int j = -1;
            int n = 0;
            for(int i = 0; i < looper.length(); i++){
                j++;
                if (looper.charAt(i)==' ') {
                    System.out.println(looper.substring(i - j, i));
                    j = 1;
                    n++;
                }
                if (n == 2){
                    System.out.println(looper.substring(i+1));
                }
            }
        }





    }
}
