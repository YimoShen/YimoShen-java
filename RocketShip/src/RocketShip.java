/*
******************
Yimo Shen
AP Comp Sci A
RocketShip Project
October 5, 2018
******************
*/

/* This assignment asks me to use for loops, static methods, print/println statements and a
class constant to generate output that looks like a rocket ship, which is shown below: */


public class RocketShip {
    public static final int CONESIZE = 6;
    public static final int QUARTERSIZE = CONESIZE/2;
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
    public static void drawCone(){ /* This method produces the cone, which also happens to be the bottom, of the rocket ship.*/
        for (int i = 1; i < CONESIZE; i++) {
            for (int a = CONESIZE; a > i; a--) {
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
    public static void drawQuarter1(){ /* This method produces the first and fourth quarter of the rocket ship. */
        for(int i=1; i<=QUARTERSIZE; i++) {
            System.out.print("|");
            for(int j=QUARTERSIZE; j>i; j--) {
                System.out.print(".");
            }
            for(int k=0; k<i; k++) {
                System.out.print("/\\");
            }
            for(int l=QUARTERSIZE; l>i; l--) {
                System.out.print(".");
            }
            for(int j=QUARTERSIZE; j>i; j--) {
                System.out.print(".");
            }
            for(int k=0; k<i; k++) {
                System.out.print("/\\");
            }
            for(int l=QUARTERSIZE; l>i; l--) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }

    }
    public static void drawQuarter2() { /* This method produces the second and third quarter of the rocket ship */
        for (int i = 1; i <= QUARTERSIZE; i++) {
            System.out.print("|");
            for (int j = 1; j < i; j++) {
                System.out.print(".");
            }
            for (int k = QUARTERSIZE; k >= i; k--) {
                System.out.print("\\/");
            }
            for (int l = 1; l < i; l++) {
                System.out.print(".");
            }for (int j = 1; j < i; j++) {
                System.out.print(".");
            }
            for (int k = QUARTERSIZE; k >= i; k--) {
                System.out.print("\\/");
            }
            for (int l = 1; l < i; l++) {
                System.out.print(".");
            }
            System.out.print("|");
            System.out.println();
        }
    }
    public static void drawLine() { /* This method produces the divider between the cone/bottom and the body and 1st and 2nd half of the body.*/
        System.out.print("+");
        for (int j = 1; j <= CONESIZE; j++) {
                System.out.print("=*");
        }
        System.out.println("+");
    }
}
