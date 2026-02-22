Ejercicios de exámenes de otros años.

##  1.        Empresa de transporte.
Una compañía mixta utiliza vehículos motorizados y animales para diversas tareas. Diseña un programa en Java que modele esta flota usando herencia e interfaces, permitiendo simular viajes y, en algunos casos, cargar mercancías o pasajeros.

Jerarquía de clases:

Interfaz Transportable. Tendrá un método viajar(double distancia), que resta combustible y suma kilómetros, y lanza una excepción si llega a cero el combustible.
Clase abstracta Vehículo con atributos para matrícula, kilómetros recorridos y combustible restante. Implementa Transportable.
Clases concretas que heredan de Vehículo:
Camión. Tiene los atributos cargaActual y capacidadMáxima (5000 kg). Además tiene un consumo de 0.1 litros/km + 0.01 litros por cada 1000 kg.
Autobús. Tiene los atributos pasajerosActuales y capacidadMáxima (50 pasajeros). Además tiene un consumo de 0.08 litros/km + 0.005 litros por pasajero.
Clase burro. NO hereda de vehículo pero implementa Transportable. Tiene atributo para nombre, energía restante, y carga. Tendrá un método para descansar que restaura la energía a 100.
Consumo: 3 unidades de energía por km.
El programa debe:

Crear un camión con 2000kg, un autobús con 20 pasajeros y un burro con carga.
Todos viajan 35km.
Muestra el consumo de combustible o si ha habido alguna incidencia (¿excepción?). ¿toString?



## 2. Sistemas de reservas de cine

Crea un sistema para gestionar reservas de entradas de cine. Implementa:

Una clase Pelicula con atributos para título, duración (en minutos) y género.
Una clase Sesion con atributos para la película, hora de inicio y número de entradas disponibles.
Métodos en Sesion para:
Reservar un número de entradas (restarlas del total si hay suficientes).
Mostrar la información de la sesión (película, hora, entradas restantes).
Lanza una excepción si se intenta reservar una sesión para la que no quedan entradas o se intentan reservar más de las que hay.
Crea un main para probar el sistema con al menos una película y una sesión.

## 3.  Control de acceso a eventos

Diseña un sistema para gestionar el acceso a eventos con estas especificaciones exactas:

Interfaz Accesible:
Método: boolean puedeEntrar(int edad) (devuelve si la persona puede entrar según la edad).
Clase abstracta Evento:
Atributos:
nombre (String): Nombre del evento (privado).
capacidad (int): Máximo de asistentes (privado).
asistentes (int): Número actual de asistentes (privado).
Constructor: Recibe nombre y capacidad, inicializa asistentes a 0.
Método abstracto: double calcularPrecio() (precio del evento por persona).
Método: agregarAsistente(): Incrementa asistentes si no supera la capacidad, lanza IllegalStateException si está lleno.
Clases concretas que hereden de Evento e implementen Accesible:
Concierto:
Atributo: esInternacional (boolean): Si el artista es internacional (privado).
Constructor: Recibe nombre, capacidad, esInternacional.
calcularPrecio(): Devuelve 50€ si es internacional, 30€ si no.
puedeEntrar(int edad): Devuelve true si edad >= 18.
Feria:
Atributo: esFamiliar (boolean): Si es para familias (privado).
Constructor: Recibe nombre, capacidad, esFamiliar.
calcularPrecio(): Devuelve 10€ si es familiar, 15€ si no.
puedeEntrar(int edad): Devuelve true si edad >= 12 o es familiar.
Clase Main:
Crea un concierto ("Rock Fest", 100, true) y una feria ("Feria Local", 50, true).
Intenta agregar 3 asistentes a cada uno:
Concierto: edades 20, 16, 25.
Feria: edades 10, 15, 30.
Muestra para cada evento: nombre, asistentes actuales, y precio total (precio * asistentes). 
