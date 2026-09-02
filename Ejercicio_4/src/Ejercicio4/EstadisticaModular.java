package Ejercicio4;
import java.util.Locale;
import java.util.Scanner;
public class EstadisticaModular {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        double[] numeros = leerDiezNumeros(entrada);
        System.out.printf(Locale.US, "El promedio es %.2f%n", promedio(numeros));
        System.out.printf(Locale.US, "La desviacion estandar es %.5f%n",
                desviacion(numeros));
        entrada.close();
    }
    public static double[] leerDiezNumeros(Scanner entrada) {
        double[] numeros = new double[10];
        System.out.println("Ingrese 10 numeros:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = entrada.nextDouble();
        }
        return numeros;
    }
    public static double promedio(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }
    public static double desviacion(double[] numeros) {
        double media = promedio(numeros);
        double sumaCuadrados = 0;
        for (double numero : numeros) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
}