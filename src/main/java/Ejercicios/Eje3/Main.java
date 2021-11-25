package Ejercicios.Eje3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        ArrayList<Cliente> listaClientes = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Cliente c = new Cliente(i);
            listaClientes.add(c);
            c.start();
        }

        for (Cliente c : listaClientes){
            c.join();
        }

        Vendedor.decirRecaudacionTotal();

    }

}