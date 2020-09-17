package ar.com.ada.online.second.polymorphism;

import subclase.ElectricalVehicle;
import subclase.SportsVehicle;
import subclase.Truck;
import superclase.Vehicle;

public class App {

    public static void main(String[] args) {
        Vehicle v[] = new Vehicle[12];
        v[0] = new Vehicle("Ford", "Focus", 2009);
        v[1] = new Vehicle("Ford", "Mustang", 2003);
        v[2] = new Vehicle("Ford", "Kuga", 2018);
        v[3] = new ElectricalVehicle("Audi", "Sportback", 2015, 450);
        v[4] = new ElectricalVehicle("BMW", "Coupe", 2007, 320);
        v[5] = new ElectricalVehicle("Ferrari", "Spider", 2005, 400);
        v[6] = new SportsVehicle("Nissan", "Gtr", 2011, 465);
        v[7] = new SportsVehicle("Lamborghini", "Coupe", 2010, 650);
        v[8] = new SportsVehicle("Camaro", "SS", 2010, 49);
        v[9] = new Truck("Chevrolet", "xwa", 2012, 99);
        v[10] = new Truck("Alfa Romeo", "Mille", 2018, 150);
        v[11] = new Truck("Citroen", "Jeeps", 2012, 100);

        for (Vehicle vehicle1 : v) {
            vehicle1.technicalSheet();
            System.out.println("toString: " + vehicle1);
            System.out.println("Vehicle hashCode: " + vehicle1.hashCode());



        }
        System.out.printf("\nSe comprara si %s es igual a %s  " +


                "\n Result =  %s\n", v[1] , v[4] , v[1].equals(v[4]));

        System.out.printf("\nSe comprara si %s es igual a %s " +


                "\n Result =  %s\n", v[8], v[11], v[8].equals(v[11]));


    }






}

