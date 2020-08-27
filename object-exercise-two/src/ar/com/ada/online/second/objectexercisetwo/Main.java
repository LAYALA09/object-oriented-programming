package ar.com.ada.online.second.objectexercisetwo;
//En base a esa clase, crear un programa que permita a un usuario crear un Item con los
//datos necesarios y en base a estos, el programa debe mostrar la siguiente salida por
//terminal:
//- Nombre: xxxx
//- Precio: xxxx
//- Impuesto: xxxx
//- Total a pagar: xxxx
//Esto solo se debe mostrar si la fecha de vencimiento aun es valida, en caso contrario, se
//debe mostrar un texto que diga: “Este Ítem no está habilitado para la venta”
//Nota: El usuario solo debe ingresar los datos para el nombre del ítem, el precio y la
//fecha de vencimiento. El impuesto y el total a pagar se deben calcular en los métodos
//de la clase.

import java.text.ParseException;
import java.text.SimpleDateFormat;


import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws Exception {
        // esta instancia es para convertir un string de fecha a un objeto Date
        public static void main (String[]args) throws ParseException {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
            Scanner keyboard = new Scanner(System.in);

            // Creo una instancia (o un objeto) de la clase Item
            Item item = new Item();

            // Pido los datos y los voy seteando a los atributos del objeto
            System.out.print("Ingrese el nombre del Item: ");
            item.name = keyboard.nextLine();
            item.name = keyboard.nextLine(); // next();

            System.out.print("Ingrese el precio del Item: ");
            item.price = Double.valueOf(keyboard.nextLine());
//        item.price = keyboard.nextDouble();
            item.price = Double.valueOf(keyboard.next());

            System.out.print("Ingrese la fecha de vencimiento del Item (dia-mes-año): ");
            item.expirationDate = dateFormat.parse(keyboard.nextLine());
            System.out.print("Ingrese la fecha de vencimiento del Item (dd-MM-yyyy): ");
            String date = keyboard.next();
            item.expirationDate = dateFormat.parse(date);
//        item.expirationDate = dateFormat.parse(keyboard.next());

            // ejecuto el metodo para calcular el impuesto
            item.calculateTax();

            // verifico si se puede vender el item
            if (item.canItBeSold()) {
                Double totalToPay = item.getTotalToPay();
                System.out.printf(
                        "\nNombre: %s\nPrecio %.2f\nImpuesto: %.2f\nTotal a pagar: %.2f",
                        item.name,
                        item.price,
                        item.tax,
                        item.getTotalToPay()
                        "- Nombre: %s\n- Precio: %.2f\n- Impuesto: %.2f\n- Total a pagar: %.2f",
                        item.name,
                        item.price,
                        item.tax,
                        totalToPay // or item.getTotalToPay()
                );
            } else {
                System.out.println("Este Ítem no está habilitado para la venta");

            }
        }

    }
}


































        


        