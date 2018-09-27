public class BoxPracticeProject {
    public static final int ROWS = 2;
    public static final int COLUMNS = 2;

    public static void main(String[] args) {
        moneyBox();
        starBox();
        hashTagBox();
    }

    public static void moneyBox() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("$");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void starBox() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void hashTagBox() {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
        System.out.println();
    }
}