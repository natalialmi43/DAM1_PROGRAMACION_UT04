package UT04Repaso.E04FlotaEspacial;

public class VehiculosMotorizados extends Elementos {

    private String numeroSerie;
    private double cantidadBateria;
    private double velocidadMaxima;

    public VehiculosMotorizados(String reporteEstado, double anchoDeBanda, String numeroSerie, double cantidadBateria, double velocidadMaxima) {
        super(reporteEstado, anchoDeBanda);
        setNumeroSerie(numeroSerie);
        setCantidadBateria(cantidadBateria);
        setVelocidadMaxima(velocidadMaxima);
    }

    public void setNumeroSerie(String numeroSerie) {
        if(numeroSerie == null || numeroSerie.isEmpty()){
            this.numeroSerie = "Default";
        } else {
            this.numeroSerie = numeroSerie;
        }
    }

    public void setCantidadBateria(double cantidadBateria) {
        if (cantidadBateria < 0){
            this.cantidadBateria = 0;
        } else {
            this.cantidadBateria = cantidadBateria;
        }
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        if (velocidadMaxima < 0){
            this.velocidadMaxima = 100;
        } else {
            this.velocidadMaxima = velocidadMaxima;
        }
    }

    /*
    protected abstract double consumoBateriaDispositivo(double kmRecorridos);

    public double consumoBateria (){

        return consumoBateriaDispositivo(double kmRecorridos);
    }

     */
}
