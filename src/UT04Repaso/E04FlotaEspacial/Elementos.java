package UT04Repaso.E04FlotaEspacial;

public class Elementos {

    private boolean transmision;
    private String reporteEstado;
    private double anchoDeBanda;

    public Elementos(String reporteEstado, double anchoDeBanda) {
        setTransmision(transmision);
        setReporteEstado(reporteEstado);
        setAnchoDeBanda(anchoDeBanda);
    }

    public void setTransmision(boolean transmision) {
        this.transmision = true;
    }

    public void setReporteEstado(String reporteEstado) {
        if (reporteEstado == null || reporteEstado.isEmpty()){
            this.reporteEstado = "Defecto";
        } else {
            this.reporteEstado = reporteEstado;
        }

    }

    public void setAnchoDeBanda(double anchoDeBanda) {
        if (anchoDeBanda < 0){
            this.anchoDeBanda = 0;
        }else {
            this.anchoDeBanda = anchoDeBanda;
        }
    }

    public void intentoTrasnsmision (){

        if (transmision && anchoDeBanda <= 0){
            throw new IllegalArgumentException("Error: NO PUEDES TRANSMITIR");
        }

    }
}
