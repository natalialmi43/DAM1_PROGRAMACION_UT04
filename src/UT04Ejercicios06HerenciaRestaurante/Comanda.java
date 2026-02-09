package UT04Ejercicios06HerenciaRestaurante;

import java.util.Arrays;

public class Comanda {

    private int numeroMesa;
    private int numeroComensales;
    private Platos[] platosQueHanPedido;
    private int contadorPlatos;
    private final int MAXIMOS_PLATOS_POSIBLES = 20;


    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        if (numeroMesa < 0) {
            this.numeroMesa = 0;
        } else {
            this.numeroMesa = numeroMesa;
        }
    }

    public int getNumeroComensales() {
        return numeroComensales;
    }

    public void setNumeroComensales(int numeroComensales) {
        if (numeroComensales < 0) {
            this.numeroComensales = 0;
        } else {
            this.numeroComensales = numeroComensales;
        }
    }

    public Platos[] getPlatosQueHanPedido() {
        return platosQueHanPedido;
    }

    public int getContadorPlatos() {
        return contadorPlatos;
    }


    public Comanda(int numeroMesa, int numeroComensales) {
        setNumeroMesa(numeroMesa);
        setNumeroComensales(numeroComensales);
        this.platosQueHanPedido = new Platos[20];
        this.contadorPlatos = 0;
    }


    public void añadirPlato (Platos plato) {
        if (contadorPlatos < MAXIMOS_PLATOS_POSIBLES) {
            platosQueHanPedido[contadorPlatos] = plato;
            contadorPlatos++;
        } else {
            System.out.println("Error, la comanda esta llena");
        }
    }

    @Override
    public String toString() {
        return "Comanda: \n" +
                "Mesa " + numeroMesa +
                " (" + numeroComensales + " comensales)" +
                "\nha pedido: " + Arrays.toString(platosQueHanPedido) +
                "\nun total de " + contadorPlatos + " platos \n";
    }


    public double coste(){

        double precioTotalComanda = 0;

        for (int i = 0; i < contadorPlatos; i++) {
            double precioDelPlato = platosQueHanPedido[i].getPrecio();
            precioTotalComanda += precioDelPlato;
        }

        return precioTotalComanda;
    }

    public void hayDiabeticosEnLaMesa(){

        for (int i = 0; i < contadorPlatos; i++) {
            if (platosQueHanPedido[i] instanceof Postres){

                Postres postre = (Postres) platosQueHanPedido[i];

                if (postre.getTieneAzucar()){
                    System.out.println("Todos los postres tienen azúcar\n");
                } else {
                    System.out.println("Alguno de los postres no tiene azúcar, puede haber algún diabético\n");
                }
            }
        }
    }

    public void imprimirTicket(){
        System.out.println("La cuenta de la mesa de la mesa " + numeroMesa + " es de " + coste() );

    }

}