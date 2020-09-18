package ar.com.ada.online.second.claseabstracta;

public class Rectangle extends Poligono {
    private double oneSide;
    private double secondSide;

    public Rectangle(double oneSide, double secondSide) {
        super(2);
        this.oneSide = oneSide;
        this.secondSide = secondSide;
    }

    public double getOneSide() {
        return oneSide;
    }

    public double getSecondSide() {
        return secondSide;
    }

    @Override
    public String toString() {
        return "Rectangle: \n" + super.toString() +
                "\noneSide= " + oneSide +
                ", secondSide=" + secondSide
                ;
    }

    @Override
    public double area() {
        return oneSide * secondSide;

    }
}
