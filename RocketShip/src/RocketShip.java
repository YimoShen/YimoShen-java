import java.sql.SQLOutput;

public class RocketShip {
    public static void main(String[] args){
        drawCone();
    }
    public static void drawCone(){
        for (int i = 1; i < 7; i++) {
            for (int a = 7; a > i; a--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("/");
                }
            System.out.print("**");
            for (int k = 0; k < i; k++ ) {
                System.out.print("\\");
                }
            System.out.println();
        }
    }
    public static void drawTop(){

    }
    public static void drawBottom(){

    }
    public static void drawLine(){

    }
}
