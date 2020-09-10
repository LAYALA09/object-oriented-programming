package ar.com.ada.online.second.exerciseoperations;


import java.util.Scanner;


public class App {


    public static void main(String[] args) {
        double a = 0;
        double b = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please, enter first number ");
        a = keyboard.nextDouble();
        System.out.println("Please, enter second number");
        b = keyboard.nextDouble();


        Result resultado = new Result();// instanciar una clase///ejemplarizar una clase
        Arithmetic calculo = new Arithmetic();

        calculo.sum(a, b, resultado);
        double sumResult = resultado.getResultSum();
        System.out.println("The result of A + B is: " + sumResult);
        calculo.multiplication(a, b, resultado);
        double multiplication = resultado.getMultiplication();
        System.out.println("The result of A * B is: " + multiplication);
        calculo.division(a, b, resultado);
        double division = resultado.getDivision();
        System.out.println("The result of A '/' B is: " + division);
        calculo.subtraction(a, b, resultado);
        double subtraction = resultado.getResultSubtraction();
        System.out.println("The result of A - B is: " + subtraction);


    }
}
