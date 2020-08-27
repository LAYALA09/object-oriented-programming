package ar.com.ada.online.second.objectexercisetwo;



import java.util.Date;

public class Item {
    String name;
    Double price;
    Double tax;
    Date expirationDate;



    void calculateTax() {
        this.tax= this.price * 0.21;

    }

    Double getTotalToPay() {
        Double result = this.price + this.tax;
        return result;
    }


         Boolean canItBeSold(){
        Date today = new Date();
        Boolean result= expirationDate.after(today);
             return result;
         }
         }





















