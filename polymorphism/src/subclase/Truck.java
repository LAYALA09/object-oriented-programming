package subclase;

import superclase.Vehicle;

import java.util.Objects;

public class Truck extends Vehicle {

    private Integer maxLoad;

    //constructor 1
    public Truck() {

    }

    //contructor 2
    public Truck(Integer maxLoad) {
        this.maxLoad = maxLoad;

    }

    //constructor 3
    public Truck(String brand, String model, Integer year, Integer maxLoad) {
        super(brand, model, year);
        this.maxLoad = maxLoad;

    }

    public void setMaxLoad(Integer maxLoad) {
        this.maxLoad = maxLoad;
    }

    public Integer getMaxLoad() {
        return maxLoad;
    }

    public void technicalSheet() {
        if (maxLoad < 100) {
            System.out.println("# Para iniciar un negocio de flete, está muy bien este auto");
        } else {
            System.out.println("# Tienes que usar este auto en el campo, es una máquina de trabajo!!");
        }
        System.out.printf("Marca : %s\n", this.brand);
        System.out.printf("Modelo : %s\n", this.model);
        System.out.printf("Año  : %s\n", this.year);
        System.out.print("\n");

    }


    @Override
    public int hashCode() {

        return -30 * Objects.hash(brand, model, year, maxLoad);


    }

    @Override
    public String toString() {
        return String.format("Truck: {brand = %s, model=%s,year= %s,potency= %s} ", this.brand, this.model, this.year, this.maxLoad);
    }


    @Override


    public boolean equals(Object obj) {


        if (this == obj) return true;

        if (obj == null || this.getClass() != obj.getClass()) return false;


        Truck that = (Truck) obj;


        return brand.equals(that.brand) && model.equals(that.model) && year.equals(that.year) && maxLoad.equals(that.maxLoad);


    }
}
