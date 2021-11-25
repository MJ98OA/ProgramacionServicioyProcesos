package Ejercicios.Eje2;

import java.util.ArrayList;

public class Main {
    public static ArrayList<Hilo> listaHilosFinalistas = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 5; i++) {
            Hilo h = new Hilo(i, 0);
            h.start();
                listaHilosFinalistas.add(h);
        }
        for (Hilo h : listaHilosFinalistas) {
            try {
                h.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        int max=maxRepeticiones(listaHilosFinalistas);
        System.out.println(escribirFinalistas(max,listaHilosFinalistas));
        System.out.println(escribirSubcampeones(max,listaHilosFinalistas));

    }

    public static int maxRepeticiones(ArrayList<Hilo> lista){
        int maximo = 0;
        for (Hilo h: lista){
            if(h.contador>maximo)
                maximo=h.contador;
        }
        return maximo;
    }

    public static String escribirFinalistas(int maximo,ArrayList<Hilo> lista){
        String resultado="";
        for(Hilo h:lista){
            if(h.contador==maximo){
                resultado=resultado+"El hilo " + h.numero + " se ha ejecutado " + h.contador + "\n";
            }
        }
        return resultado;
    }

    public static String escribirSubcampeones(int maximo,ArrayList<Hilo> lista){
        String resultado="";
        int numero=1;
        for(Hilo h:lista){
            if(numero<maximo){
                numero=h.contador;
            }
            if(h.contador==numero){
                resultado=resultado+"El hilo " + h.numero + " se ha ejecutado " + h.contador + "\n";
            }
        }
        return resultado;
    }
}