import java.sql.SQLOutput;

public class DrawBoxes {

    public static void main(String[] args) {
        DrawBoxes();
        DrawBoxes();
        DrawBoxes();

    }

    public static void Top() {
        System.out.println("+----------+");
    }
    public static void Middle() {
        System.out.println("|          |");
    }
    public static void Bottom() {
        System.out.println("+----------+");

    }
    public static void DrawBoxes(){
        Top();
        Middle();
        Middle();
        Middle();
        Bottom();
    }
}
