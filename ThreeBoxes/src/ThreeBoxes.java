public class ThreeBoxes {
    public static void main (String [] args) {
        starBox(height=10, width=10, ch: '*');
        moneyBox();
        hashtagBox();
    }
    public static void starBox (int height, int width, char ch) {
        for (int i=0; i<height; i++) {
            for(int j=0; j<width; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void moneyBox (int height, int width, char ch) {
        for (int i=0; i<height; i++) {
            for(int j=0; j<width; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    public static void hashtagBox (int height, int width, char ch) {
        for (int i=0; i<height; i++) {
            for(int j=0; j<width; j++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}