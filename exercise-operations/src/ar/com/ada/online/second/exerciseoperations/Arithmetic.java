package ar.com.ada.online.second.exerciseoperations;



public class Arithmetic {


    public static void sum(double a, double b, Result finalresultSum) {

        double c = a + b;
        finalresultSum.setResultSum(c);


    }

    public static void subtraction(double a, double b, Result finalresultsubstraction) {
        double c = a - b;
        finalresultsubstraction.setResultSubtraction(c);

    }

    public static void multiplication(double a, double b, Result finalresultmultiplication) {
        double c = a * b;
        finalresultmultiplication.setMultiplication(c);
    }

    public static void division(double a, double b, Result finalresultdivision) {
        double c = a / b;
        finalresultdivision.setDivision(c);

    }


}
