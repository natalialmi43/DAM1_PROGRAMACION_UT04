package UT04Ejercicios10Repaso.E05EstacionDeEnergia;

public class Reactor extends ModuloControl {

    private int temperaturaActual;

    public Reactor(int temperaturaInicial) {
        this.temperaturaActual = temperaturaInicial;
    }

    // La palabra "throws" avisa obligatoriamente al sistema de que este método es peligroso
    public void inyectarCombustible(int cantidad) throws EnergiaCriticaException {

        if (cantidad < 0) {
            // Detonamos la excepción si la cantidad es negativa
            throw new EnergiaCriticaException("Alarma: No puedes inyectar cantidades negativas de combustible (" + cantidad + ").");
        }

        if (this.temperaturaActual > 100) {
            // Detonamos la excepción si el núcleo está sobrecalentado
            throw new EnergiaCriticaException("Alarma: El núcleo supera los 100 grados. Inyección bloqueada por riesgo de fusión.");
        }

        System.out.println("Inyección completada con éxito. Cantidad: " + cantidad);
    }
}
