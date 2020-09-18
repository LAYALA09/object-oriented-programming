package ar.com.ada.online.second.claseabstracta;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static ArrayList<Poligono> poligono = new ArrayList<Poligono>();///arreglo dinamico al estar fuera de main tiene que ser static y hay q importar la clase de ArrayList.
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        fillPolygon();
    }
        // llenar poligono
        public static void fillPolygon() {
            int option;
            char response;
            do {
                do {

                    System.out.println("Digitize what polygon you want");
                    System.out.println("1. Triangle");
                    System.out.println("2. Triangle");
                    System.out.print("Option: ");
                    option = keyboard.nextInt();

                } while (option < 1 || option > 2);
                switch (option) {
                    case 1:fullOfTriangle();// llenar triangulo
                        break;
                    case 2:  // llenar rectangulo
                        break;
                }
                System.out.print("\nYou want to introduce another triangle(s/n: ");
                response = keyboard.next().charAt(0);
                System.out.println("");

            } while (response == 's' || response == 'S');

        }
        public static <Triangle> void fullOfTriangle(){
        double oneSide,secondSide,threeSide;
        System.out.print("\nType the side 1 triangle ");
            oneSide=keyboard.nextDouble();
            System.out.print("\nType the side 2 triangle");
            secondSide=keyboard.nextDouble();
            System.out.print("\nType the side 3 triangle ");
            threeSide=keyboard.nextDouble();
           // Triangle  triangle=new Triangle (oneSide,secondSide,threeSide);
//poligono.add(triangle);

        }
    }

