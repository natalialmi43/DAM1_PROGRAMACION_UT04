package UT04Repaso.E01Comanda;

public class Comanda {

    private int numeroMesa;
    private int numeroComensales;
    private Plato [] platoPedido;
    private int contadorPlatos;
    private int MAXIMO_PLATOS = 10;

    public Comanda(int numeroMesa, int numeroComensales) {
        this.numeroMesa = numeroMesa;
        this.numeroComensales = numeroComensales;
        this.platoPedido = new Plato[MAXIMO_PLATOS];
        this.contadorPlatos = 0;
    }

    public void setNumeroMesa(int numeroMesa) {
        if (numeroMesa < 0){
            this.numeroMesa = 0;
        } else {
            this.numeroMesa = numeroMesa;
        }
    }

    public void setNumeroComensales(int numeroComensales) {
        if (numeroComensales < 0){
            this.numeroComensales = 0;
        } else {
            this.numeroComensales = numeroComensales;
        }
    }

    public void addPlato (Plato plato){

        if (contadorPlatos < MAXIMO_PLATOS){
            platoPedido[contadorPlatos] = plato;
            contadorPlatos ++;
        }
    }

    public double sacarCuenta (){

        double precioTotalComanda = 0;
        for (int i = 0; i < contadorPlatos; i++) {
            precioTotalComanda += platoPedido [i].getPrecio();
        }

        return precioTotalComanda;
    }

    public boolean hayDiabeticos (){

        boolean hay = false;

        for (int i = 0; i < contadorPlatos; i++) {
            if (platoPedido [i] instanceof Postre){
                Postre p1 = (Postre) platoPedido[i];
                if (p1.isTieneAzucar()){
                    hay = true;
                }
            }
        }
        return hay;
    }

    public void printComanda (){
        System.out.println("--- COMANDA ---");
        System.out.println("Numero de mesa: " + numeroMesa);
        System.out.println("Numero de comensales: " + numeroComensales);

        for (int i = 0; i < contadorPlatos; i++) {
            System.out.println(platoPedido [i]);
        }

        System.out.println("Precio total " + sacarCuenta());

        System.out.println(hayDiabeticos()? "Hay diabeticos " : "No hay diabeticos");
    }



}