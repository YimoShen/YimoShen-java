/*
****************
Yimo Shen
AP CS A
October 18, 2018
Distance Project
****************
*/

public class Distance {
    public static void main(String[] args){
        //Exercise 1: Steilacoom to Tacoma
        System.out.println(SteilacoomTacoma() + " miles");
        //Exercise 2: Steilacoom to Tacoma to Gig Harbor
        System.out.println(SteilacoomTacoma() + TacomaGigHarbor()+" miles");
        //Exercise 3: Steilacoom to Tacoma to Gig Harbor to Steilacoom
        System.out.println(SteilacoomTacoma() + TacomaGigHarbor() + GigHarborSteilacoom()+" miles");
    }
    //The formula to calculate distance between two cities
    public static double distanceFormula (int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1, 2));
    }
    //Distance between Steilacoom and Tacoma
    public static double SteilacoomTacoma() {
        return distanceFormula(2,8,16,10);
    }
    //Distance between Tacoma and Gig Harbor
    public static double TacomaGigHarbor() {
        return distanceFormula(16,10,4,28);
    }
    //Distance between Gig Harbor and Steilacoom
    public static double GigHarborSteilacoom() {
       return distanceFormula(4,28,2,8);
    }
}
