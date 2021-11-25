package Ejercicios.ExamenB;

import java.util.Random;



public class Soldado extends Thread {
    Random r = new Random();


    Boolean bonus;
    int Njugador;
    CampoBatalla cb =new CampoBatalla();

    public Soldado(Boolean bonus, int Njugador) {
        this.bonus = bonus;
        this.Njugador = Njugador;
    }

    @Override
    public void run() {
        System.out.println("He llegado "+this.Njugador);
        try {
            CampoBatalla.dormirJugar(this);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }



}
