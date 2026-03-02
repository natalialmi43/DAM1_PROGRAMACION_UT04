package UT04Examen.E01Transportes;

public abstract class Vehiculo implements Transportable{

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
            this.matricula = "matricula";
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

    public double getCombustibleRestante() {
        return combustibleRestante;
    }

    public void setCombustibleRestante(double combustibleRestante) {
        if (combustibleRestante < 0){
            this.combustibleRestante = 10;
        } else {
            this.combustibleRestante = combustibleRestante;
        }
    }

    protected abstract double consumo (double distancia);

    @Override
    public void viajar(double distancia) throws SinCombustible {

        double consumo = consumo(distancia);

        if  ( combustibleRestante <= consumo){
            throw new SinCombustible("No tienes combustible");
        }
        combustibleRestante -= consumo;
        kmRecorridos += distancia;
    }

    public String toString (){
        return "El vehiculo con matricula " + matricula + " tiene " + kmRecorridos +
                " km recorridos y tiene " + combustibleRestante + " comubistible restante. ";
    }
}
