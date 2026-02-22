## Ejercicio 1: El Sistema de Empleados

Objetivo: Comprender la jerarquía básica y el uso de super().
Tarea: Crea una clase Empleado con nombre y sueldoBase. Luego, crea una subclase Gerente que añada un bono. El constructor de Gerente debe usar super para inicializar los datos del padre. Sobrescribe el método calcularSueldo() para sumar el bono en el caso del Gerente.


## Ejercicio 2: Figuras Geométricas Coloreadas

Objetivo: Implementar métodos obligatorios en las hijas.
Tarea: Define una clase abstracta Figura con un atributo protected String color. Añade un método abstracto double calcularArea(). Crea las clases Circulo (radio) y Rectangulo (ancho y alto) que hereden de Figura e implementen el cálculo del área según su fórmula.


## Ejercicio 3: El Almacén Conectable

Objetivo: Simular herencia múltiple mediante interfaces.
Tarea: Crea las interfaces Conectable (con métodos encender() y apagar()) y Recargable (con cargarBateria()). Crea una clase Smartphone que implemente ambas y una clase Lampara que solo sea Conectable. En el main, crea un array de tipo Conectable[] que contenga ambos objetos.


## Ejercicio 4: Gestión "ElectroÁvila"

Objetivo: Manejar colecciones heterogéneas y realizar downcasting seguro.
Tarea: Usando la jerarquía de Electrodomestico, Lavadora y Television:
Crea un array Electrodomestico[] con varios objetos de cada tipo.
Recorre el array y calcula el precioFinal() de cada uno.
Si el objeto actual es una Television (usa instanceof), realiza un casting para mostrar sus pulgadas.


## Ejercicio 5: La Estación de Energía Crítica

Jerarquía: Crea la clase abstracta ModuloControl y la subclase Reactor.
Excepción: Crea EnergiaCriticaException (comprobada/checked).
Lógica: El método inyectarCombustible(int cantidad) en Reactor debe lanzar la excepción si la cantidad es negativa o si el sistema supera los 100 grados.
Main: Crea un objeto Reactor, intenta inyectar combustible y usa un bloque try-catch-finally para manejar el error y asegurar que se imprima siempre el "Estado de seguridad" en el finally 