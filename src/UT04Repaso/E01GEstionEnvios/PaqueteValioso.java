package UT04Repaso.E01GEstionEnvios;

public class PaqueteValioso extends Envio implements Asegurable {

    private double valorDeclarado;

    public PaqueteValioso(String codigoRastreo, double distanciaKm, double valorDeclarado) {
        super(codigoRastreo, distanciaKm);
        setValorDeclarado(valorDeclarado);
    }

    public void setValorDeclarado(double valorDeclarado) {
        if (valorDeclarado < 0){
            this.valorDeclarado = 0;
        } else {
            this.valorDeclarado = valorDeclarado;
        }
    }

    @Override
    public double calcularSeguro( ) {
        return valorDeclarado * 0.05;
    }

    @Override
    protected double calcularCosteEnvio() {
        return getDistanciaKm() *0.25 + calcularSeguro();
    }
}
