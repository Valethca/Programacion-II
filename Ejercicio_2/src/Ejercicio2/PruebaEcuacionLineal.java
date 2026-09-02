package Ejercicio2;
import java.util.Scanner;
import java.util.Locale;
public class PruebaEcuacionLineal{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        System.out.print("Ingrese a, b, c, d, e, f: ");
        double a = entrada.nextDouble();
        double b = entrada.nextDouble();
        double c = entrada.nextDouble();
        double d = entrada.nextDouble();
        double e = entrada.nextDouble();
        double f = entrada.nextDouble();
        EcuacionLineal ecuacion = new EcuacionLineal(a, b, c, d, e, f);
        if (ecuacion.tieneSolucion()) {
            System.out.println("x = " + ecuacion.getX()
                    + ", y = " + ecuacion.getY());
        } else {
            System.out.println("La ecuacion no tiene solucion.");
        }
        entrada.close();
    }
}