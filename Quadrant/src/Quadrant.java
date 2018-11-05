public class Quadrant {
    public static void main (String[] args) {
        System.out.println(Quadrant(4.3,8.9));
    }
    public static String Quadrant(double x, double y){
        if (x>0 && y>0) {
            return "Quadrant 1";
        }
        else if (x<0 && y>0) {
            return "Quadrant 2";
        }
        else if (x<0 && y<0) {
            return "Quadrant 3";
        }
        else if (x>0 && y<0) {
            return "Quadrant 4";
        } else {
            return "0";
        }
    }
}
