package UT04Ejercicios11RepasoExamenesPasados.E03ControlAcceso;

public abstract  class Evento {

    private String nombreEvento;
    private int capacidadMaxima;
    private int asistenes;

    public Evento(String nombreEvento, int capacidadMaxima) {
        setNombreEvento(nombreEvento);
        setCapacidadMaxima(capacidadMaxima);
        this.asistenes = 0;
    }

    public void setNombreEvento(String nombreEvento) {
        if (nombreEvento == null || nombreEvento.isEmpty()){
            this.nombreEvento = "Default";
        } else {
            this.nombreEvento = nombreEvento;
        }
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        if (capacidadMaxima < 0){
            this.capacidadMaxima = 10;
        } else {
            this.capacidadMaxima = capacidadMaxima;
        }
    }

    protected abstract double calcularPrecio();

    public void agregarAsistente(){
        asistenes ++;

        if (asistenes > capacidadMaxima){
            throw  new IllegalArgumentException("Error: no se pueden agregar más asistentes " + capacidadMaxima + " es el máximo");
        }

        System.out.println("Gracias :)");
    }

}
