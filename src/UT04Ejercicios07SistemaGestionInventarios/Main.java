package UT04Ejercicios07SistemaGestionInventarios;

public class Main {
        public static void main(String[] args) {

            Lavadora l1 = new Lavadora(45, 7,40);
            Lavadora l2 = new Lavadora(45,Color.ROJO, 'A',7,45);

            Television t1 = new Television(100,5,50,true,true);


            Inventario i1 = new Inventario();

            i1.addElectrodomesticos(l1);
            i1.addElectrodomesticos(l2);
            i1.addElectrodomesticos(t1);

            i1.mostrarPrecioFinalArticulo();

            i1.calcularTotalAcumuladoVentas();

    }
}
