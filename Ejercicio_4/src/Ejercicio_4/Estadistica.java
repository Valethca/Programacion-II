package Ejercicio_4;
public class Estadistica {
    private double[] numeros;
    public Estadistica(double[] numeros) {
        this.numeros = numeros.clone();
    }
    public double promedio() {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }
    public double desviacion() {
        double media = promedio();
        double sumaCuadrados = 0;
        for (double numero : numeros) {
            sumaCuadrados += Math.pow(numero - media, 2);
        }
        return Math.sqrt(sumaCuadrados / (numeros.length - 1));
    }
}