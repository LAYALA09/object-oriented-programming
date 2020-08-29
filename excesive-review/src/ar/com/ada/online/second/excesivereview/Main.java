package ar.com.ada.online.second.excesivereview;

import java.util.Scanner;

//Pedir el radio de un círculo y calcular su área. A=PI*r^2 en clase Radio luego mostrar
//Pedir dos números y decir si son iguales o no, tambien indicar si es positivo o negativo en clase Igualdad, mostrar.
public class Main {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        Igualdad number = new Igualdad();
        Radiuscalculation medida = new Radiuscalculation();

        //ingrese dos números
        System.out.print("Ingrese primer número: ");
        number.number1 = keyboard.nextInt();
        System.out.print("Ingrese primer número: ");
        number.number2 = keyboard.nextInt();

        //ingreso radio del circulo para calcular área
        System.out.print("Ingrese radio: ");
        medida.radio = keyboard.nextDouble();



        //muestro la comparación para saber si son iguales y también si son negativo o positivos
        System.out.println(number.dime_igualdad());
        System.out.println(number.dime_positnegativnumber1());
        System.out.println(number.dime_positnegativnumber2());



        ///calculo area y muesto// una forma
       // medida.area = Math.PI * Math.pow(medida.radio, 2);

        ///calculo area y muesto// otra  forma pero usando métodos
        System.out.println("El área de un circulo de radio "  + medida.radio + " es " + medida.calcular_Area());


    }
}
