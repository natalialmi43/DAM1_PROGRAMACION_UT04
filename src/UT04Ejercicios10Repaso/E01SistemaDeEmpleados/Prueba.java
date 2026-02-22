package UT04Ejercicios10Repaso.E01SistemaDeEmpleados;

public class Prueba {
    public static void main(String[] args) {

        Empleado e1 = new Empleado("Maria", 1800);

        Gerente g1 = new Gerente("Marta", -1600, 50);


        System.out.println(e1.calcularSueldo());

        System.out.println(g1.calcularSueldo());

    }

}
