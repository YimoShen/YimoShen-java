public class returnIntegers {
    public static void main (String[] args){
        System.out.println(min(1,3,5));
        System.out.println(madMath(2,4,6));

    }
    public static int min(int x1, int x2, int x3) {
        return(Math.min(Math.min(x1,x2),x3));
    }
    public static double madMath(int x1, int x2, int x3){
        double answer = Math.sqrt(Math.min(Math.min(x1,x2),x3)+Math.max(Math.max(x1,x2),x3));
        return answer;
    }
}