package Ejercicio1;
import java.util.Random;
public class PruebaCronometro {
    public static void main(String[] args) {
        final int CANTIDAD = 100_000;
        int[] numeros = new int[CANTIDAD];
        Random aleatorio = new Random();
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(1_000_000);
        }
        Cronometro cronometro = new Cronometro();
        ordenacionPorSeleccion(numeros);
        cronometro.detener();
        System.out.println("Se ordenaron " + CANTIDAD + " números.");
        System.out.println("Tiempo de ordenación: "
                + cronometro.lapsoDeTiempo() + " milisegundos.");
        System.out.println("¿El arreglo quedó ordenado? " + estaOrdenado(numeros));
    }
    public static void ordenacionPorSeleccion(int[] datos) {
        for (int i = 0; i < datos.length - 1; i++) {
            int indiceMenor = i;

            for (int j = i + 1; j < datos.length; j++) {
                if (datos[j] < datos[indiceMenor]) {
                    indiceMenor = j;
                }
            }

            int temporal = datos[i];
            datos[i] = datos[indiceMenor];
            datos[indiceMenor] = temporal;
        }
    }
    private static boolean estaOrdenado(int[] datos) {
        for (int i = 0; i < datos.length - 1; i++) {
            if (datos[i] > datos[i + 1]) {
                return false;
            }
        }
        return true;
    }
}