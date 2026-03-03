package UT04Repaso.E01Comanda;

public abstract class Plato {

    private String nombre;
    private double precio;

    public Plato(String nombre, double precio) {
        setNombre(nombre);
        setPrecio(precio);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()){
            this.nombre = "Sin nombre";
        } else {
            this.nombre = nombre;
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if(precio < 0){
            this.precio = 0;
        } else {
            this.precio = precio;
        }
    }

    public String toString (){
        return "El plato " + nombre + " cuesta " + precio;
    }

}
