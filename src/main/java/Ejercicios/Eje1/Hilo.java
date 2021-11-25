package Ejercicios.Eje1;
import java.util.Random;

public class Hilo extends Thread {

    Random r = new Random();

    public final int numero;

    public long tiempoFinalizacion;


    public Hilo(int numero){
        this.numero = numero;
    }

    @Override
    public void run() {
        long comienzo = System.currentTimeMillis();
        try {
            Thread.sleep(r.nextInt(3000));
            System.out.println("Salgo de la siesta " + this.numero);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Estoy activo " + this.numero);
        tiempoFinalizacion = System.currentTimeMillis();
        Main.listaHilosOrdenada.add(this);
        long tiempoDormido = tiempoFinalizacion - comienzo;
        System.out.println("Soy el hilo nº " + numero + " y he dormido por " + tiempoDormido + " milisegundos");
    }


}