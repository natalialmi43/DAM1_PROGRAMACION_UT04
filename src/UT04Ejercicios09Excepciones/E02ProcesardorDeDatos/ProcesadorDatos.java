package UT04Ejercicios09Excepciones.E02ProcesardorDeDatos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ProcesadorDatos {

    public void procesarEntrada (){

        BufferedReader lector = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Introduce un número para dividir a 100: ");

            // PASO 1: Leer la línea de texto (Esto es lo que puede lanzar IOException)
            String linea = lector.readLine();

            // PASO 2: Convertir esa 'linea' de String a un número entero (int)
            int n = Integer.parseInt(linea);

            // PASO 3: Dividir 100 por el número que has guardado e imprimir el resultado
            int rtdo = 100/n;
            System.out.println(rtdo);

        } catch (IOException e) {
            System.out.println("Error físico: Falló la lectura de la consola.");

        } catch (NumberFormatException e) {
            System.out.println("Error de formato: Has introducido texto o símbolos. Debes escribir un número entero");

        } catch (ArithmeticException e) {
            System.out.println("Error matemático: Es imposible dividir entre cero.");

        } finally {
            System.out.println("El proceso ha terminado");

        }


    }
}
