package UT04Examen.E01Transportes;

public class Burro implements Transportable{

    private String nombre;
    private double energiaRestante;
    private double carga;

    public Burro(String nombre, double energiaRestante, double carga) {
        this.nombre = nombre;
        this.energiaRestante = energiaRestante;
        this.carga = carga;
    }


    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            this.nombre = "nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public void setEnergiaRestante(double energiaRestante) {
        if (energiaRestante < 0){
            this.energiaRestante = 100;
        } else {
            this.energiaRestante = energiaRestante;
        }
    }

    public void setCarga(double carga) {
        if (carga < 0){
            this.carga = 0;
        } else {
            this.carga = carga;
        }
    }

    @Override
    public void viajar(double distancia) throws SinCombustible {

        double consumo = 3 * distancia;

        if (energiaRestante < consumo){
            throw new SinCombustible("El burrito no tiene energia");
        }

        energiaRestante -= consumo;

    }

    public void restaurarEnergia (){
        energiaRestante = 100;
    }

    public String toString (){
        return "El burro se llama " + nombre + " tiene " + energiaRestante +
                " de energia y tiene " + carga + " carga actual. ";
    }
}
