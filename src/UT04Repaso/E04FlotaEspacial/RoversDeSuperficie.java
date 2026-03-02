package UT04Repaso.E04FlotaEspacial;

public class RoversDeSuperficie extends VehiculosMotorizados {

    private int numeroRuedas;
    private double compartimentoRocasKg;

    public RoversDeSuperficie(String reporteEstado, double anchoDeBanda, String numeroSerie, double cantidadBateria, double velocidadMaxima, int numeroRuedas, double compartimentoRocasKg) {
        super(reporteEstado, anchoDeBanda, numeroSerie, cantidadBateria, velocidadMaxima);
        this.numeroRuedas = numeroRuedas;
        this.compartimentoRocasKg = compartimentoRocasKg;
    }

    public void setNumeroRuedas(int numeroRuedas) {
        this.numeroRuedas = numeroRuedas;
    }

    public void setCompartimentoRocasKg(double compartimentoRocasKg) {
        this.compartimentoRocasKg = compartimentoRocasKg;
    }
}

/*
    @Override
    protected double consumoBateriaDispositivo(double kmRecorridos) {
        return kmRecorridos * (2 + (0.5*compartimentoRocasKg));
    }
}
*/
