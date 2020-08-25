package ar.com.ada.online.second.objectexerciseone;

public class Main {

    public static void main(String[] args) {
        Person Lucia = new Person();
        Vehicle car = new Vehicle();
        Animal dog = new Animal();

        Lucia.name = "Lucia";
        Lucia.lastName = "Gimenez";
        Lucia.age = 29;

        car.brand = "peugeot";
        car.maxSpeed = 150;
        car.color = "gris";

        dog.breed = "doberman";
        dog.Aname = "Tody";
        dog.Acolor = "Marrón";
        System.out.println("Su nombre y apellido es " + Lucia.name + " " + Lucia.lastName + " y su edad " + Lucia.age + " años");
        System.out.println("Su auto es " + car.brand + ", velocidad máxima " + car.maxSpeed + ", y es de color " + car.color);
        System.out.println("Su perro es de  raza " + dog.breed + ", se llama " + dog.Aname + " y es de color " + dog.Acolor);


    }
}
