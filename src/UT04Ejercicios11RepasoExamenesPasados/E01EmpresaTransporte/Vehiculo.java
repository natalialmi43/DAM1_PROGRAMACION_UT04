package UT04Ejercicios11RepasoExamenesPasados.E01EmpresaTransporte;

public abstract class Vehiculo  implements Transportable {

    private String matricula;
    private double kmRecorridos;
    private double combustibleRestante;

    public Vehiculo(String matricula, double kmRecorridos, double combustibleRestante) {
        setMatricula(matricula);
        setKmRecorridos(kmRecorridos);
        setCombustibleRestante(combustibleRestante);
    }



    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isEmpty()){
            this.matricula = "Default";
        } else {
            this.matricula = matricula;
        }
    }

    public void setKmRecorridos(double kmRecorridos) {
        if (kmRecorridos < 0){
            this.kmRecorridos = 0;
        } else {
            this.kmRecorridos = kmRecorridos;
        }
    }

    public void setCombustibleRestante(double combustibleRestante) {
        if (combustibleRestante < 0){
            this.combustibleRestante = 0;
        } else {
            this.combustibleRestante = combustibleRestante;
        }
    }

    protected abstract double calcularConsumo (double distancia);


    @Override
    public void viajar(double distancia) throws IllegalArgumentException {

        double gasto = calcularConsumo(distancia);

        if (combustibleRestante <= 0){
            throw new IllegalArgumentException("No tienes combustible");
        }

        combustibleRestante -= gasto;

        kmRecorridos += distancia;

        System.out.println("Te queda " + combustibleRestante + " combustible restante");
    }




}
