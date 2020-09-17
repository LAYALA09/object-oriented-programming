package superclase;

import java.util.Objects;

public class Vehicle {
    protected String brand;
    protected String model;
    protected Integer year;

    public Vehicle() {

    }

    public Vehicle(String brand, String model, Integer year) {
        this.brand = brand;
        this.model = model;
        this.year = year;


    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getYear() {
        return year;
    }

    public void technicalSheet() {
        System.out.println("# Este vehiculo no tiene categoria asignada");
        System.out.printf("Marca : %s\n", this.brand);
        System.out.printf("Modelo : %s\n", this.model);
        System.out.printf("Año  : %s\n", this.year);
        System.out.print("\n");


    }

    @Override
    public int hashCode() {

        return -30 * Objects.hash(brand, model, year);


    }

    @Override
    public String toString() {
        return String.format("Vehicle: {brand = %s, model=%s,year= %s} ", this.brand, this.model, this.year);
    }


    @Override


    public boolean equals(Object obj) {


        if (this == obj) return true;


        if (obj == null || this.getClass() != obj.getClass()) return false;


        Vehicle that = (Vehicle ) obj;


        return brand.equals(that.brand +1 ) && model.equals(that.model + 1) && year.equals(that.year + 1);


    }
}