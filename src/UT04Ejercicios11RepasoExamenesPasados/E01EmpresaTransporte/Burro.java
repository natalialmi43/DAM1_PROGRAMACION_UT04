package UT04Ejercicios11RepasoExamenesPasados.E01EmpresaTransporte;

public class Burro implements Transportable {

    private String nombre;
    private double energiaRestante;
    private double carga;

    public Burro(String nombre, double energiaRestante, double carga) {
        setNombre(nombre);
        setEnergiaRestante(energiaRestante);
        setCarga(carga);
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            this.nombre = "Por defecto";
        } else {
            this.nombre = nombre;
        }
    }

    public double getEnergiaRestante() {
        return energiaRestante;
    }

    public void setEnergiaRestante(double energiaRestante) {
        if (energiaRestante < 0){
            this.energiaRestante = 0;
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

    public void descansar (){
        energiaRestante = 100;
    }

    @Override
    public void viajar(double distancia) throws IllegalArgumentException {

        // Importante poner esto antes del if.
        double gasto = distancia * 3;

        if (energiaRestante <= 0){
            throw new IllegalArgumentException("Sin energia");
        }

        energiaRestante -= gasto;

        System.out.println("Te queda " + energiaRestante + " combustible restante");

    }
}
