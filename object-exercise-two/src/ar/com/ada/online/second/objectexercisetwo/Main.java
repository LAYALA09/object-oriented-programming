package ar.com.ada.online.second.objectexercisetwo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Main {

    public static void main(String[] args, Scanner keyboard) {
        SecondClass itemName = new SecondClass();
        SecondClass itemPrice= new SecondClass();
        SecondClass itemTax = new SecondClass();
        SecondClass itemTotalToPay=new SecondClass();
        SecondClass date=new SecondClass();
        Date itemExpirationDate=new Date();
        Date actualDate = new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/YY");
        Scanner Keyboard = new Scanner(System.in);

        try{
            System.out.println("Ingrese el nombre del producto. ");

            itemName.name = keyboard.nextLine();
            

            System.out.print("Ingrese el precio del producto: ");
            itemPrice.price = keyboard.nextDouble();

            System.out.print("Ingrese la fecha de vencimiento del producto(dd/MM/yy): ");
            date.expirationDate = keyboard.next();//Se guarda la fecha en una variable de tipo STRING

            itemExpirationDate = dateFormat.parse(String.valueOf(date.expirationDate)); //Y aca se transforma una variable de un tipo a otro tipo
        }
        catch (ParseException e){//Responde a la excepcion de parse

        }


        Date today = new Date();
        Date expirationDate=new  Date;
        


    }
}

        


        