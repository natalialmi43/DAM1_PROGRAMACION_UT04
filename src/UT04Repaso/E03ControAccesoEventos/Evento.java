package UT04Repaso.E03ControAccesoEventos;

public abstract class Evento {
    private String nombre;
    private int capacidad;
    private int asistentes;

    public Evento(String nombre, int capacidad) {
        setNombre(nombre);
        setCapacidad(capacidad);
        this.asistentes = 0;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            this.nombre = "nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public void setCapacidad(int capacidad) {
        if (capacidad < 0){
            this.capacidad = 100;
        } else {
            this.capacidad = capacidad;
        }
    }

    protected abstract double calcularPrecio ();

    public void agregarAsistente (){
        if (asistentes < capacidad){
            asistentes ++;
        } else {
            throw new IllegalStateException("No hay mas sitios disponibles");
        }

    }

}
