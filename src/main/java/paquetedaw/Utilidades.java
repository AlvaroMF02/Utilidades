package paquetedaw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author alvaro
 */
public class Utilidades {

    //ATRIBUTOS
    private static Scanner teclado = new Scanner(System.in);
    private static Random alea = new Random();

    //LEER ENTERO SIN ERRORES
    public static int leerEnteroSinErrores() {
        int num = 0;
        boolean repetir = true;

        do {
            System.out.println("INDIQUE UN NÚMERO ENTERO");
            try {

                num = teclado.nextInt();
                repetir = false;

            } catch (InputMismatchException ime) {
                System.out.println("ERROR (EL NÚMERO NO ERA ENTERO)\n");
                //LIMPIAR BUFFER
                teclado.nextLine();
            }

        } while (repetir);

        return num;
    }

    //MISMO METODO PERO CON UN RANGO
    public static int leerNumeroRango(int num, int min, int max) {
        int numero = 0;
        boolean bucle = true;
        do {

            num = leerEnteroSinErrores();   //LLAMADA AL PRIMER METODO 
            if (num >= min && num <= max) {
                num = numero;
                bucle = false;
            } else {
                System.out.println("NÚMERO FUERA DE RANGO\n");
                bucle = true;
            }

        } while (bucle);

        return numero;
    }

    // NÚMERO ENTERO DENTRO DE UN RANGO
    public static boolean numeroDentroRango(int num, int min, int max) {
        boolean rango = true;
        int numero = leerEnteroSinErrores();

        if (numero >= min && numero <= max) {
            System.out.println("EL NÚMERO ESTÁ EN EL RANGO");

        } else {
            System.out.println("NÚMERO FUERA DE RANGO\n");
            rango = false;
        }

        return rango;
    }

    // GENERAR ALEA EN UN RANGO
    public static int aleatorioDentroRango(int min, int max) {
        int numeroGenerado;

        numeroGenerado = alea.nextInt(max - min + 1) + min;

        return numeroGenerado;

    }

}
