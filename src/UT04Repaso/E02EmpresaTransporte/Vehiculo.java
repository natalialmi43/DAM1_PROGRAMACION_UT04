package UT04Repaso.E02EmpresaTransporte;

public abstract class Vehiculo implements Transportable{
    private String matricula;
    private double kmRecorridos;
    private double combustibleRestante;

    public Vehiculo(String matricula, double kmRecorridos, double combustibleRestante) {
        this.matricula = matricula;
        this.kmRecorridos = kmRecorridos;
        this.combustibleRestante = combustibleRestante;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.isEmpty()){
            this.matricula = "default";
        } else {
            this.matricula = matricula;
        }
    }

    public double getKmRecorridos() {
        return kmRecorridos;
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
            this.combustibleRestante = 0;
        } else {
            this.combustibleRestante = combustibleRestante;
        }
    }

    public abstract double consumo (double km);

    @Override
    public void viajar(double distancia) throws SinCombustible {

        if (combustibleRestante <= 0){
            throw new SinCombustible(" No hay combustible");
        }

    }
}
