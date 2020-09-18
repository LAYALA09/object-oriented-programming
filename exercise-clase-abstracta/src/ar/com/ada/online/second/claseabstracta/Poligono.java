package ar.com.ada.online.second.claseabstracta;

public abstract class Poligono {
    protected int numberSides;///se declara protected para que puedan usar sus sub clases

    public Poligono(int numberSides) {
        this.numberSides = numberSides;
    }

    public int getNumberSides() {
        return numberSides;
    }

    @Override//Indica la sobreescritura y porque pertenece a la clase object
    public String toString() {///Metodo sobreescribido sirve para mostrar datos
        return
                "Number the sides=" + numberSides +
                '}';
    }
    public abstract double area();////declaramos el metodo area como abstracto

    }

