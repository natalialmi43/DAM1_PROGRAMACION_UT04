package UT04Examen.E03Acceso;

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
            this.capacidad = 50;
        } else {
            this.capacidad = capacidad;
        }
    }

    protected abstract double calcularPrecio ();

    public void agregarAsitente (){
        if (capacidad < asistentes){
            throw new IllegalStateException("Error: el evento '" + nombre + "' esta lleno");
        }

        asistentes ++;

    }


    public String toString (){
        double precio = calcularPrecio() * asistentes;
        return "El evento " + nombre + "tiene una capacidad para " + capacidad + " personas, actualmente hay " + asistentes + " confirmados y el precio total es de " + precio;
    }

}
