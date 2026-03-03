package UT04Ejercicios07SistemaGestionInventarios;

public class Inventario {

    private Electrodomestico [] electrodomesticos;
    private int contadorElectrodmesticos;
    private final int MAXIMO_ELECTRODOMESTICOS = 100;


    public Inventario() {
        this.electrodomesticos = new Electrodomestico[MAXIMO_ELECTRODOMESTICOS];
        this.contadorElectrodmesticos = 0;
    }



    public void addElectrodomesticos (Electrodomestico electrodomestico){

        if (contadorElectrodmesticos < MAXIMO_ELECTRODOMESTICOS){
            this.electrodomesticos [contadorElectrodmesticos] = electrodomestico;
            contadorElectrodmesticos ++;
        } else {
            System.out.println("Ya no se puede mas");
        }
    }

    public void mostrarPrecioFinalArticulo (){

        for (int i = 0; i < contadorElectrodmesticos; i++) {
            System.out.println(this.electrodomesticos [i].calcularPrecioFinal());
        }
    }

    public void calcularTotalAcumuladoVentas (){

        double dineroRecaudadoLavadoras = 0;
        double dineroRecaudadoTelevisiores = 0;
        double dineroRecaudadoTotal = 0;

        for (int i = 0; i < contadorElectrodmesticos; i++) {

            double precioArticulo = electrodomesticos [i].calcularPrecioFinal();

            dineroRecaudadoTotal += precioArticulo;

            if (this.electrodomesticos[i] instanceof Lavadora){
                dineroRecaudadoLavadoras += precioArticulo;
            } else if (this.electrodomesticos[i] instanceof Television){
                dineroRecaudadoTelevisiores += precioArticulo;
            }
        }

        System.out.println("Se ha recaudado en lavadoras " + dineroRecaudadoLavadoras);
        System.out.println("Se ha recaudado en televisiones " + dineroRecaudadoTelevisiores);
        System.out.println("Se ha recaudado en total " + dineroRecaudadoTotal);

    }

}
