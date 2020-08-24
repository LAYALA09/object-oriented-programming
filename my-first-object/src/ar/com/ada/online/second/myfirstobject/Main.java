package ar.com.ada.online.second.myfirstobject;

public class Main {

    public static void main(String[] args) {
        Person almendra = new Person();
        Person giuliana = new Person();
        Person paulina = new Person();


        almendra.name = "Almendra";
        almendra.lastName = "Polezzeli";

        giuliana.name = "Giuliana";
        giuliana.lastName = "Fertonani";

        paulina.name = "Paulina";
        paulina.lastName = "Stanic";

        //ejecutar el método
        almendra.showAttributesValues();
        giuliana.showAttributesValues();
        paulina.showAttributesValues();

        // calculo de objeto
        Calculator myCalculator = new Calculator();

        //método setter
        myCalculator.numberA = 10;
        myCalculator.numberB = 2;

        //ejecutar los metodos
        Integer resultSum = myCalculator.sumAttributes();
        Integer resultMultiply = myCalculator.multiplyAttributes() ;

        System.out.printf("El resultado son, Mul: %d y la Sum: %d", resultMultiply, resultSum);


    }
}
