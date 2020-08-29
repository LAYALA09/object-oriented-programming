package ar.com.ada.online.second.excesivereview;

public class Radiuscalculation {
    Double area;
    Double radio;

    public void establece_radio(double radio){
        this.radio=radio;
    }


    public double calcular_Area(){
        return (3.1416*radio*radio);
    }



}


