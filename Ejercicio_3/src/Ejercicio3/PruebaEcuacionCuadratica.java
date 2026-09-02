package Ejercicio3;
import java.util.Locale;
import java.util.Scanner;
public class PruebaEcuacionCuadratica {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.print("Ingrese a, b, c: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        EcuacionCuadratica ecuacion = new EcuacionCuadratica(a, b, c);
        double discriminante = ecuacion.getDiscriminante();
        if (discriminante > 0) {
            System.out.printf(Locale.US,
                    "La ecuacion tiene dos raices %.6f y %.6f%n",
                    ecuacion.getRaiz1(), ecuacion.getRaiz2());
        } else if (discriminante == 0) {
            System.out.printf(Locale.US,
                    "La ecuacion tiene una raiz %.6f%n", ecuacion.getRaiz1());
        } else {
            System.out.println("La ecuacion no tiene raices reales");
        }
        entrada.close();
    }
}