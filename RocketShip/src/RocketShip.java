/*
******************
Yimo Shen
AP Comp Sci A
RocketShip Project
October 5, 2018
******************
*/

public class RocketShip {
    public static final int CONEHEIGHT = 6;
    public static final int QUARTERHEIGHT = 3;
    public static void main(String[] args){
        drawCone();
        drawLine();
        drawQuarter1();
        drawQuarter2();
        drawLine();
        drawQuarter2();
        drawQuarter1();
        drawLine();
        drawCone();
    }
    public static void drawCone(){
        for (int i = 1; i < CONEHEIGHT; i++) {
            for (int a = CONEHEIGHT; a > i; a--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("/");
                }
            System.out.print("**");
            for (int k = 1; k <= i; k++ ) {
                System.out.print("\\");
                }

            System.out.println();
        }
    }
    public static void drawQuarter1(){
        for(int i=1; i<=QUARTERHEIGHT; i++) {
            System.out.print("|");
            for(int j=3; j>i; j--) {
                System.out.print(".");
            }
            for(int k=0; k<i; k++) {
                System.out.print("/\\");
            }
            for(int l=3; l>i; l--) {
                System.out.print(".");
            }
            for(int j=3; j>i; j--) {
                System.out.print(".");
            }
            for(int k=0; k<i; k++) {
                System.out.print("/\\");
            }
            for(int l=3; l>i; l--) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }

    }
    public static void drawQuarter2() {
        for (int i = 1; i <= 3; i++) {
            System.out.print("|");
            for (int j = 1; j < i; j++) {
                System.out.print(".");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print("\\/");
            }
            for (int l = 1; l < i; l++) {
                System.out.print(".");
            }for (int j = 1; j < i; j++) {
                System.out.print(".");
            }
            for (int k = 3; k >= i; k--) {
                System.out.print("\\/");
            }
            for (int l = 1; l < i; l++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void drawLine() {
        System.out.println("+=*=*=*=*=*=*+");
    }
}
