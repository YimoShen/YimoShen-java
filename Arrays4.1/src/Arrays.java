import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        // Exercise 1
        int[] numbersArray = new int[8];
        // Exercise 2a
        numbersArray[0]=10;
        numbersArray[1]=20;
        numbersArray[2]=30;
        numbersArray[3]=40;
        numbersArray[4]=50;
        numbersArray[5]=60;
        numbersArray[6]=70;
        numbersArray[7]=80;
        // Exercise 2b
        int[] numbersArray1 = {10,20,30,40,50,60,70,80};
        // Exercise 2c
        for (int i = 0; i < 5; i++) {
            numbersArray1[i] = i;
        }
        // Exercise 2d
        Scanner inputArray = new Scanner(System.in);
        for (int i = 0; i < 4; i++){
            numbersArray1[i] = inputArray.nextInt();
        }
        // Exercise 2e
        int[] numbersArray2 = {-4, 19, 3, 20, 72, 58};

        // Exercise 3a
        System.out.println(numbersArray1[numbersArray1.length-1]);
    }
}