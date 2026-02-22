## Ejercicio 1

Crea una clase llamada ValidadorNumero con un método validarPositivo que reciba un número entero. Si el número es negativo, lanza una excepción no comprobada (IllegalArgumentException) con un mensaje adecuado.

Requisitos:
Implementar el método validarPositivo que lance IllegalArgumentException si el número es negativo.
En la clase Main, llama al método con diferentes valores para probar el manejo de la excepción.

## Ejercicio 2

Descripción: Crea una clase llamada ProcesadorDatos con un método procesarEntrada que realice las siguientes operaciones:
Leer una línea de texto desde la consola.
Convertir la línea leída a un número entero.
Dividir 100 por el número ingresado.
Implementa el manejo de excepciones para capturar posibles errores que puedan ocurrir durante estas operaciones, como:
IOException: Si ocurre un error al leer la entrada de la consola.
NumberFormatException: Si la entrada no se puede convertir a un número entero.
ArithmeticException: Si se intenta dividir por cero.
Requisitos:
Utilizar un bloque try que englobe las operaciones mencionadas.
Implementar múltiples bloques catch para manejar cada tipo de excepción de forma específica.
Mostrar mensajes de error claros y descriptivos para cada excepción capturada.
Añadir un bloque finally que imprima un mensaje indicando que el proceso ha finalizado, independientemente de si ocurrió una excepción o no.
