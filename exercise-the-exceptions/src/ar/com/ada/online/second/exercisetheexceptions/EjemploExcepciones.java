package ar.com.ada.online.second.exercisetheexceptions;

public class EjemploExcepciones {

    public static int devuelveNumero(int num) {
        try {
            if (num % 2 == 0) {
                throw new Exception("Lanzando excepcion");
            }
            return 1;
        } catch (Exception ex) {
            return 2;
        } finally {
            return 3;
        }
    }
}
