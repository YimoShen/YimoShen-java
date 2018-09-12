public class SixDays {
    public static void main(String[] args) {
        FirstDay();
        System.out.println();
        SecondDay();
        System.out.println();
        ThirdDay();
        System.out.println();
        FourthDay();
        System.out.println();
        FifthDay();
        System.out.println();
        SixthDay();
    }
    public static void FirstDay(){
        System.out.println("On the 1st day of \"Xmas\", my true love sent to me");
        FirstGift();
    }
    public static void SecondDay(){
        System.out.println("On the 2nd day of \"Xmas\", my true love sent to me");
        SecondGift();
    }
    public static void ThirdDay(){
        System.out.println("On the 3rd day of \"Xmas\", my true love sent to me");
        ThirdGift();
    }
    public static void FourthDay(){
        System.out.println("On the 4th day of \"Xmas\", my true love sent to me");
        FourthGift();
    }
    public static void FifthDay(){
        System.out.println("On the 5th day of \"Xmas\", my true love sent to me");
        FifthGift();
    }
    public static void SixthDay(){
        System.out.println("On the 6th day of \"Xmas\", my true love sent to me");
        SixthGift();
    }
    public static void FirstGift(){
        System.out.println("a partridge in a pear tree.");
    }
    public static void SecondGift(){
        System.out.println("two turtle doves, and");
        FirstGift();
    }
    public static void ThirdGift(){
        System.out.println("three french hens,");
        SecondGift();
    }
    public static void FourthGift(){
        System.out.println(("four calling birds,"));
        ThirdGift();
    }
    public static void FifthGift(){
        System.out.println("five golden rings,");
        FourthGift();
    }
    public static void SixthGift(){
        System.out.println("six geese a-laying.");
        FifthGift();
    }
}

/*
**********************
* Yimo Shen
* AP CS A
* Period 1
* September 10th, 2018
* Project #1 - SixDays of Xmas
**********************
*/


