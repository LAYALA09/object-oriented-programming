package ar.com.ada.online.second.polymorphism;

import subclase.ElectricalVehicle;
import subclase.SportsVehicle;
import subclase.Truck;
import superclase.Vehicle;

public class App {

    public static void main(String[] args) {
        Vehicle vehicle= new Vehicle("Ford", "novent",2009);
        Vehicle electricalVehicle= new ElectricalVehicle("Audi", "xwa",2005,600);
        Vehicle sportsVehicle= new SportsVehicle("Audi", "xwa",2010,250);
        Vehicle truck = new Truck("Audi", "xwa",2012,100);

         vehicle.technicalSheet();
         electricalVehicle.technicalSheet();
        sportsVehicle.technicalSheet();
        truck.technicalSheet();





    }
}
