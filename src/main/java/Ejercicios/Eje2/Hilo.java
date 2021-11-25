package Ejercicios.Eje2;

import java.util.Random;


public class Hilo extends Thread{

    public final int numero;
    public int contador;
    Random r=new Random();
    public Hilo(int numero,int contador){
        this.numero=numero;
        this.contador=contador;
    }

    @Override
    public void run(){

        try {

            Thread.sleep(1000);
            this.contador++;
            while(!r.nextBoolean()){
                Thread.sleep(1000);
                this.contador++;
            }

            System.out.println("Soy el hilo " + this.numero + " y he dormido "+ this.contador +" veces");

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

}
