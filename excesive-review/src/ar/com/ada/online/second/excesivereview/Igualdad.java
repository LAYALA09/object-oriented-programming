package ar.com.ada.online.second.excesivereview;

public class Igualdad {
    Integer number1;
    Integer number2;


    String dime_igualdad() { //getter
        if (number1 == number2) {
            return "Los números son iguales";
        } else {

            return "Los números no son iguales";

        }


    }

    String dime_positnegativnumber1() { //getter

        if (number1 >= 0) {
            return number1 + " es un número positivo";
        } else {
            return number1 + " es un número negativo";
        }
    }

    String dime_positnegativnumber2() { //getter
        if (number2 >= 0) {
            return number2 + " es un número positivo";
        } else {

            return number2 + " es un número negativo";
        }

    }
}

















