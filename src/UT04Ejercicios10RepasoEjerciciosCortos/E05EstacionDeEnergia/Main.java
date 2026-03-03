package UT04Ejercicios10RepasoEjerciciosCortos.E05EstacionDeEnergia;

public class Main {
    public static void main(String[] args) {

        // Iniciamos un reactor con 120 grados (sobrecalentado) para forzar el segundo error
        Reactor miReactor = new Reactor(120);

        System.out.println("--- INICIANDO SECUENCIA DE INYECCIÓN ---");

        try {
            // Intentamos inyectar combustible.
            // Como la temperatura es 120, esto lanzará la excepción inmediatamente.
            miReactor.inyectarCombustible(50);

        } catch (EnergiaCriticaException e) {
            // Capturamos el error comprobado y mostramos su mensaje
            System.out.println(e.getMessage());

        } finally {
            // Este bloque se ejecuta siempre para garantizar la seguridad del sistema
            System.out.println("Estado de seguridad: Protocolos de cierre verificados. Sistema estable.");
        }
    }
}
