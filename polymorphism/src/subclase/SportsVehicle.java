package subclase;

import superclase.Vehicle;

import java.util.Objects;

public class SportsVehicle extends Vehicle {  //Hereda de Vehicle
    private Integer rpm;

    //construct 1
    public SportsVehicle() {

    }

    //construct 2
    public SportsVehicle(Integer rpm) {
        this.rpm = rpm;

    }

    //construct 3
    public SportsVehicle(String brand, String model, Integer year, Integer rpm) {
        super(brand, model, year);//herencia
        this.rpm = rpm; // propio de la clase


    }

    public void setRpm(Integer rpm) {
        this.rpm = rpm;
    }

    public Integer getRpm() {
        return rpm;
    }

    public void technicalSheet() {
        if (rpm >= 0 && rpm <= 50) {
            System.out.println("# El auto es muy bonito, pero solo sirve para salir a pasear");
        } else {
            if (rpm <= 300) {
                System.out.println("# Con este auto puedes desafiar a cualquiera en la pista");
            } else {
                if (rpm <= 600) {
                    System.out.println("# Si tienes este  auto, debe considerar participar en Nazcar");
                } else {
                    System.out.println("# ¿Eres parte del elenco de rápidos y furiosos?");
                }
            }
        }
        System.out.printf("Marca : %s\n", this.brand);
        System.out.printf("Modelo : %s\n", this.model);
        System.out.printf("Año  : %s\n", this.year);
        System.out.print("\n");
    }

    @Override
    public int hashCode() {

        return -30 * Objects.hash(brand, model, year, rpm);


    }

    @Override
    public String toString() {
        return String.format("SportsVehicle: {brand = %s, model=%s,year= %s,potency= %s} ", this.brand, this.model, this.year, this.rpm);
    }


    @Override


    public boolean equals(Object obj) {


        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;


        SportsVehicle that = (SportsVehicle) obj;


        return brand.equals(that.brand) && model.equals(that.model) && year.equals(that.year) && rpm.equals(that.rpm);


    }
}
