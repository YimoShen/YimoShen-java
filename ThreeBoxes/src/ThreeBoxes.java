public class ThreeBoxes {
    public static void main(String[] args) {
        drawBox(10, 10, '*');
        drawBox(10, 10, '$');
        drawBox(10, 10, '#');
    }

    public static void drawBox(int height, int width, char ch) {
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}