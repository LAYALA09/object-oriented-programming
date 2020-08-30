package ar.com.ada.online.second.exercisetheexceptions;
//Se utilizan en Java para capturar las excepciones que se hayan podido producir en el bloque de código delimitado por try y catch. En cuanto se produce la excepción, la ejecución del bloque try termina. La cláusula catch recibe como argumento un objeto Throwable. ¡ El bloque 4 nunca se llegará a ejecutar !

public class Main {

    public static void main(String[] args) {


        //usando método para exepciones
        System.out.println(EjemploExcepciones.devuelveNumero(1));
    }
}