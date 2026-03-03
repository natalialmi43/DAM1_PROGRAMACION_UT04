package UT04Ejercicios06HerenciaRestaurante;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Comanda {

    private int numeroMesa;
    private int numeroComensales;
    private Platos [] platosPedidos;
    private int contadorPlatos;
    private final int MAXIMO_PLATOS = 10;

    public Comanda(int numeroMesa, int numeroComensales) {
        setNumeroMesa(numeroMesa);
        setNumeroComensales (numeroComensales);
        this.platosPedidos = new Platos [20];
        this.contadorPlatos = 0;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        if (numeroMesa < 0){
            this.numeroMesa = 0;
        } else {
            this.numeroMesa = numeroMesa;
        }
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        if (numeroComensales < 0){
            this.numeroComensales = 0;
        } else {
            this.numeroComensales = numeroComensales;
        }
    }

    public void addPlato (Platos plato){

        if (contadorPlatos < MAXIMO_PLATOS){
            platosPedidos [contadorPlatos] = plato;
            contadorPlatos ++;
        } else {
            System.out.println("No entran mas platos.");
        }
    }

    public double sacarCuenta (){

        double total = 0;

        for (int i = 0; i < contadorPlatos; i++) {
            total += platosPedidos [i].getPrecio();
        }

        return total;
    }

    public boolean hayDiabeticos() {

        boolean hayDiabeticos = false;

        for (int i = 0; i < contadorPlatos; i++) {
            if (platosPedidos[i] instanceof Postres){
                Postres postre = (Postres) platosPedidos [i];
                if(postre.getTieneAzucar()){
                    hayDiabeticos = true;
                }
            }
        }
        return hayDiabeticos;
    }


    public void mostrarComanda() {
        System.out.println("\n=== COMANDA MESA " + numeroMesa + " ===");
        System.out.println("Comensales: " + numeroComensales);
        System.out.println("Platos pedidos: " + contadorPlatos);
        System.out.println("-------------------------");

        if (contadorPlatos == 0) {
            System.out.println("Aún no se han pedido platos.");
        }

        // Recorremos el array usando tu contador de límite
        for (int i = 0; i < contadorPlatos; i++) {
            // Imprimimos el objeto plato que hay en cada hueco
            System.out.println("- " + platosPedidos[i]);
        }

        System.out.println("-------------------------");
        System.out.println("Total a pagar: " + sacarCuenta() + "€");
        System.out.println("=========================");
    }

}
