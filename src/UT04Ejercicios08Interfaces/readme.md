Instrucciones
El Sistema de Notificaciones

Una aplicación necesita enviar mensajes a los usuarios. Al principio solo enviamos Emails, pero queremos que el sistema esté listo para enviar SMS o notificaciones Push en el futuro.

La Interfaz: Crea Notificador con un método enviarMensaje(String mensaje, String destinatario).
Las Clases:  
EmailNotificador: Debe imprimir "Enviando Email a [destinatario]: [mensaje]".
SMSNotificador: Debe imprimir "Enviando SMS al número [destinatario]: [mensaje]".
Crea un Array de Notificador donde metas objetos de ambos tipos y recorre la lista con un bucle llamando al método enviarMensaje.



El RPG

Estás programando un RPG. Hay personajes que pueden atacar y otros que pueden curar, pero ¡algunos pueden hacer ambas cosas!

Las Interfaces:  
Atacante: método atacar().
Curador: método curar().
Las Clases:
Guerrero: Solo implementa Atacante.
Clérigo: Solo implementa Curador.
Paladín: ¡Implementa ambas interfaces!
En tu clase Main, crea un método llamado realizarAccionHeroica(Atacante a) que llame al método atacar. Prueba a pasarle tanto al Guerrero como al Paladín. ¿Ves cómo el Paladín puede "disfrazarse" de Atacante?



Reproductor

Estamos creando el núcleo de una App tipo Spotify/YouTube. Necesitamos unificar cómo se comportan los diferentes medios.

Crea una interfaz llamada Reproducible con tres métodos void:
reproducir()
pausar()
parar()
Crea dos clases que implementen la interfaz:
Clase Audio: Al reproducir debe decir "Sonando canción...".
Clase Video: Al reproducir debe decir "Proyectando película en 4K...".
En el main, crea un objeto de cada tipo, pero guárdalos dentro de variables de tipo Reproducible. Llama a sus métodos.



El Feed de Redes Sociales

Vamos a simular el "Muro" de una red social donde conviven textos, fotos y vídeos.

Interfaz Publicacion:
Método void mostrar(): Muestra el contenido por pantalla.
Método int verLikes(): Devuelve un número aleatorio de likes.
Clases:
Texto: Tiene un atributo String contenido. Al mostrar, imprime el texto entre comillas.
Foto: Tiene un atributo String resolucion (ej: "1080x1080"). Al mostrar, dice "Mostrando foto en [resolucion]".
El Reto (Main):
Crea un Array de Publicacion.
Añade 2 textos y 2 fotos mezclados.
Recorre la lista con un bucle for-each y muestra todas las publicaciones seguidas de sus likes.


Herencia Múltiple Simulada

En Java no se puede heredar de dos padres, pero sí implementar dos interfaces. Vamos a modelar objetos electrónicos.

Interfaz Conectable: Método void encender() y void apagar().
Interfaz Recargable: Método void cargarBateria() y int getNivelBateria().
Clases:
Lampara: Solo es Conectable (va enchufada).
Movil: Es Conectable Y ADEMÁS Recargable.
Crea un array de Conectable y mete objetos de cada tipo.

Ahora intenta meter una Lámpara y un Móvil en un array de Recargable. ¿Por qué da error la lámpara? ¿Cómo lo solucionarías en el código? 