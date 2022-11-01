package paquetedaw;

/**
 *
 * @author alvaro
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("********************************************************");
        System.out.println("LEER NÚMERO ENTRE UN RANGO Y LEER NÚMERO ENTERO");
        System.out.println("********************************************************");
        Utilidades.leerNumeroRango(5, 4, 10);

        System.out.println("********************************************************");
        System.out.println("LEER UN NÚMERO ENTERO");
        System.out.println("********************************************************");
        Utilidades.leerEnteroSinErrores();

        System.out.println("******************************************************");
        System.out.println("CREACIÓN DE NUMERO ALEATORIO");
        System.out.println("******************************************************");
        System.out.println(Utilidades.aleatorioDentroRango(10, 15));

    }
}
