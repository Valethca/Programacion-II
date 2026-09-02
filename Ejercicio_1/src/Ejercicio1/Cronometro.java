package Ejercicio1;
public class Cronometro {
    private long inicia;
    private long finaliza;
    public Cronometro() {
        inicia();
    }
    public long getInicia() {
        return inicia;
    }
    public long getFinaliza() {
        return finaliza;
    }
    public void inicia() {
        inicia = System.currentTimeMillis();
        finaliza = 0;
    }
    public void detener() {
        finaliza = System.currentTimeMillis();
    }
    public long lapsoDeTiempo() {
        long fin = (finaliza == 0) ? System.currentTimeMillis() : finaliza;
        return fin - inicia;
    }
}
