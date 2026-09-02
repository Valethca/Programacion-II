package Ejercicio_4;
import java.util.Locale;
import java.util.Scanner;
public class PruebaEstadistica  {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextDouble();
        }
        Estadistica estadistica = new Estadistica(numeros);
        System.out.printf(Locale.US, "El promedio es %.2f%n",
                estadistica.promedio());
        System.out.printf(Locale.US, "La desviacion estandar es %.5f%n",
                estadistica.desviacion());
        entrada.close();
    }
}