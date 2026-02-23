package UT04Repaso.E01GEstionEnvios;

public abstract class Envio {

    private String codigoRastreo;
    private double distanciaKm;
    private String estado;

    public Envio(String codigoRastreo, double distanciaKm) {
        setCodigoRastreo(codigoRastreo);
        setDistanciaKm(distanciaKm);
        this.estado = "En tránsito";
    }

    public void setCodigoRastreo(String codigoRastreo) {
        if (codigoRastreo == null || codigoRastreo.isEmpty()){
            this.codigoRastreo = "Defecto";
        } else {
            this.codigoRastreo = codigoRastreo;
        }
    }

    public double getDistanciaKm() {
        return distanciaKm;
    }

    public void setDistanciaKm(double distanciaKm) {
        if (distanciaKm < 0){
            this.distanciaKm = 0;
        } else {
            this.distanciaKm = distanciaKm;
        }
    }

    protected abstract double calcularCosteEnvio();

    public void entregar() {

        if (estado.equals("Enviado")){
            throw  new IllegalArgumentException("Error: el pedido esta enviado.");
        } else {
            this.estado = "Enviado";
        }

    }

    public double precioFinal (){
        return calcularCosteEnvio();
    }

}
