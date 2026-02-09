package herenciaRestaurante;

public abstract class Platos {

    private String nombre;
    private double precio;


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            this.nombre = "Nombre del plato por defecto";
        } else {
            this.nombre = nombre;
        }

    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {

        if (precio < 0){
            this.precio = 0.00;
        } else {
            this.precio = precio;
        }
    }

    public Platos(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
    }


    @Override
    public String toString() {
        return "El plato " + nombre + " cuesta " + precio + "€";
    }
}
