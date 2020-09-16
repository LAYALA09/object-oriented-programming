package subclase;

import superclase.Vehicle;

import java.util.Objects;

public class ElectricalVehicle extends Vehicle {
    private Integer potency;

    //constructor 1
    public ElectricalVehicle() {

    }

    //contructor 2
    public ElectricalVehicle(Integer potency) {
        this.potency = potency;

    }

    //constructor 3
    public ElectricalVehicle(String brand, String model, Integer year, Integer potency) {
        super(brand, model, year);
        this.potency = potency;

    }

    public void setPotency(Integer potency) {
        this.potency = potency;
    }

    public Integer getPotency() {
        return potency;
    }

    public void technicalSheet() {
        if (year < 2007){
            System.out.println("No existe modelo para este año");
        }else {
            System.out.println("Es un auto de ultima tecnologia");
        }
            System.out.printf("Marca : %s\n", this.brand);
            System.out.printf("Modelo : %s\n", this.model);
            System.out.printf("Año  : %s\n", this.year);
            System.out.print("\n");

        }


    @Override
    public int hashCode() {

        return -30 * Objects.hash(brand, model, year, potency);


    }

    @Override
    public String toString() {
        return String.format("ElectricalVehicle: {brand = %s, model=%s,year= %s,potency= %s} ", this.brand, this.model, this.year, this.potency);
    }


    @Override


    public boolean equals(Object obj) {


        if (this == obj) return true;


        if (obj == null || this.getClass() != obj.getClass()) return false;


        ElectricalVehicle that = (ElectricalVehicle) obj;


        return brand.equals(that.brand) && model.equals(that.model) && year.equals(that.year)&& potency.equals(that.potency);


    }
}