package Ejercicios.ExamenB;

import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicBoolean;

public class CampoBatalla {
    AtomicBoolean aBoolean = new AtomicBoolean(false);
    public static Semaphore semaphore = new Semaphore(10, true);

    static void dormirJugar(Soldado soldado) throws InterruptedException {

        System.out.println("Soy el soldado " + soldado.Njugador + " y estoy en batalla ");
        Thread.sleep(1000);
        if (semaphore.tryAcquire()) {
            System.out.println("Soldado " + soldado.Njugador);
        } else
            System.out.println("Me voy " + soldado.Njugador);
    }
}

