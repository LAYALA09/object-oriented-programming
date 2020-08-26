package ar.com.ada.online.second.objectexercisetwo;


public class SecondClass {
    String name;
    Double price;
    Double tax;
    String expirationDate;



    void calculateTax() {
        tax = price * 0.21;
    }

    Double getTotalToPay() {
        Double result = price + tax;
        return result;
    }

    void canItBeSold() {



        return;
    }
}






