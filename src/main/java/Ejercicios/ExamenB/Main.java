package Ejercicios.ExamenB;

import java.util.ArrayList;

public class Main {
    public final int NUMERO_JUGADORES=15;
    public Integer jugadoresEnCola=0;
    public static ArrayList <Soldado> listasoldado=new ArrayList<>();

    public static void main(String [] args) throws InterruptedException {

        for(int i=0;i<15;i++){
            Soldado s=new Soldado(false,i);
            s.start();
        }


    }


}
