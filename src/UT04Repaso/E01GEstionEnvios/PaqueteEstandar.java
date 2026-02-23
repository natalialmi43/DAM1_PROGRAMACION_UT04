package UT04Repaso.E01GEstionEnvios;

public class PaqueteEstandar extends Envio {

    private double pesoKg;

    public PaqueteEstandar(String codigoRastreo, double distanciaKm, double pesoKg) {
        super(codigoRastreo, distanciaKm);
        this.pesoKg = pesoKg;
    }

    public void setPesoKg(double pesoKg) {
        if (pesoKg <0){
            this.pesoKg = 1;
        } else {
            this.pesoKg = pesoKg;
        }
    }

    @Override
    protected double calcularCosteEnvio() {
        return super.getDistanciaKm() * 0.1 + pesoKg * 0.5;
    }

}
